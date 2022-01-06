package com.java.assignment.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "store_information")
public class StoreInformation {

	@Id
	private int storeId;
	private int ownerId;
	private String storeName;
	private String genre;
	private int booksCount;
	private Set<String> bookIds;

	public int getStoreId() {
		return storeId;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getBooksCount() {
		return booksCount;
	}

	public void setBooksCount(int booksCount) {
		this.booksCount = booksCount;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<String> getBookIds() {
		return bookIds;
	}

	public void setBookIds(Set<String> bookIds) {
		this.bookIds = bookIds;
	}

	@Override
	public String toString() {
		return "StoreInformation [storeId=" + storeId + ", storeName=" + storeName + ", booksCount=" + booksCount
				+ ", bookIds=" + bookIds + "]";
	}
}