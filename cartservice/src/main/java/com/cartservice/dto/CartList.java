package com.cartservice.dto;

import java.util.List;

import com.cartservice.entities.Cart;

public class CartList {
	private List<Cart> cartList;

	public CartList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartList(List<Cart> cartList) {
		super();
		this.cartList = cartList;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

	
	
}
