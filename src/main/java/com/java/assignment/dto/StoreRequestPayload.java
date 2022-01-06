package com.java.assignment.dto;

public class StoreRequestPayload {

	private int ownerId;
	private String storeName;
	private String genre;

	public StoreRequestPayload() {

	}

	public StoreRequestPayload(int ownerId, String storeName, String genre) {
		super();
		this.ownerId = ownerId;
		this.storeName = storeName;
		this.genre = genre;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "StoreRequestPayload [ownerId=" + ownerId + ", storeName=" + storeName + ", genre=" + genre + "]";
	}
}