package com.java.assignment.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.java.assignment.model.BookInformation;

public class BooksUtil {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static Map<String, BookInformation> populateGoogleBooks(String category, int storeId) {

		if(category != null && storeId > 0) {

			String uri = "https://www.googleapis.com/books/v1/volumes?q=incategories:"+category+"&maxResults=40";
	
			RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri, String.class);
	
		    JsonObject json = new JsonParser().parse(result).getAsJsonObject();
	
		    if (json != null) {
	
			    JsonArray jsonArray = json.get("items").getAsJsonArray();
		
			    Map<String, BookInformation> books = new HashMap<>();
		
			    for (JsonElement eachObject : jsonArray) {
		
			    	if (eachObject.getAsJsonObject().get("id").isJsonNull())
			    		continue;
		
			    	BookInformation book = new BookInformation();
	
			    	book.setStoreId(storeId);
			    	book.setBookId(eachObject.getAsJsonObject().get("id").getAsString());
			    	book.setBookCount(40);
			    	
			    	JsonObject volumeObject = eachObject.getAsJsonObject().get("volumeInfo").getAsJsonObject();
			    	
			    	if (!volumeObject.isJsonNull()) {
		
				    	book.setDescription(volumeObject.getAsJsonObject().get("description") != null ?
				    			volumeObject.getAsJsonObject().get("description").getAsString() : null);
				    	
				    	book.setPublishedDate(volumeObject.getAsJsonObject().get("publishedDate") != null ?
				    			volumeObject.getAsJsonObject().get("publishedDate").getAsString() : null);
				    	
				    	book.setPublisher(volumeObject.getAsJsonObject().get("publisher") != null ?
				    			volumeObject.getAsJsonObject().get("publisher").getAsString() : null);
				    	
				    	book.setPageCount(volumeObject.getAsJsonObject().get("pageCount") != null ?
				    			volumeObject.getAsJsonObject().get("pageCount").getAsInt() : 0);
		
				    	book.setSubtitle(volumeObject.getAsJsonObject().get("subtitle") != null ?
				    			volumeObject.getAsJsonObject().get("subtitle").getAsString() : null);
				    	
				    	book.setTitle(volumeObject.getAsJsonObject().get("title").getAsString());
				    	
				    	book.setCategories(volumeObject.getAsJsonObject().get("categories") != null ?
						    	new Gson().fromJson(volumeObject.getAsJsonObject().get("categories").getAsJsonArray(), ArrayList.class)
						    	: null);
		
				    	book.setAuthors(volumeObject.getAsJsonObject().get("authors") != null ?
						    	new Gson().fromJson(volumeObject.getAsJsonObject().get("authors").getAsJsonArray(), ArrayList.class)
						    	: null);
				    	
				    	book.setInfoLink(volumeObject.getAsJsonObject().get("infoLink") != null ?
				    			volumeObject.getAsJsonObject().get("infoLink").getAsString() : null);
		
				    	book.setInfoLink(volumeObject.getAsJsonObject().get("previewLink") != null ?
				    			volumeObject.getAsJsonObject().get("previewLink").getAsString() : null);
		
				    	JsonObject imageLinksObject = volumeObject.getAsJsonObject().get("imageLinks") != null ?
				    			volumeObject.getAsJsonObject().get("imageLinks").getAsJsonObject() : null;
		
				    	if (imageLinksObject != null)
					    	book.setThumbnail(imageLinksObject.getAsJsonObject().get("thumbnail") != null ?
					    			imageLinksObject.getAsJsonObject().get("thumbnail").getAsString() : null);
		
				    	JsonObject saleObject = eachObject.getAsJsonObject().get("saleInfo") != null ?
				    				eachObject.getAsJsonObject().get("volumeInfo").getAsJsonObject() : null;
		
				    	if (saleObject != null) {
		
				    		book.setBuyLink(saleObject.getAsJsonObject().get("buyLink") != null ?
				    				saleObject.getAsJsonObject().get("buyLink").getAsString() : null);
		
				    		JsonObject listPrice = saleObject.getAsJsonObject().get("listPrice") != null ?
				    				saleObject.getAsJsonObject().get("listPrice").getAsJsonObject() : null;
				    		book.setPrice(listPrice != null ?
				    				(listPrice.get("amount") != null ? listPrice.get("amount").getAsDouble() : null) : 0.0);
				    	}
	
				    	books.put(book.getBookId(), book);
			    	}else
			    		continue;
			    }
			    return books;
		    }else
		    	return null;
		}else
			return null;
	}
}