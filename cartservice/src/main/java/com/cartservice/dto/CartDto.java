package com.cartservice.dto;

public class CartDto {
	private int custId;
	private int itemId;
	private int quantity;

	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDto(int custId, int itemId, int quantity) {
		super();
		this.custId = custId;
		this.itemId = itemId;
		this.quantity = quantity;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
