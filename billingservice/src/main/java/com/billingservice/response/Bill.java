package com.billingservice.response;

import java.util.List;
import java.util.Map;

public class Bill {
	private Map<Item, Integer> purchasedItems;
	private int totalQuantity;
	private double totalAmount;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Map<Item, Integer> purchasedItems, int totalQuantity, double totalAmount) {
		super();
		this.purchasedItems = purchasedItems;
		this.totalQuantity = totalQuantity;
		this.totalAmount = totalAmount;
	}

	public Map<Item, Integer> getPurchasedItems() {
		return purchasedItems;
	}

	public void setPurchasedItems(Map<Item, Integer> purchasedItems) {
		this.purchasedItems = purchasedItems;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
