package com.billingservice.response;

public class Item {
	private int itemId;
	private String name;
	private String category;
	private double price;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String name, String category, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}
