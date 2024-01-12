package com.billingservice.response;

public class Cart {
	private int cartId;
	private int custId;
	private int itemId;
	private int quantity;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, int custId, int itemId, int quantity) {
		super();
		this.cartId = cartId;
		this.custId = custId;
		this.itemId = itemId;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", custId=" + custId + ", itemId=" + itemId + ", quantity=" + quantity + "]";
	}

}
