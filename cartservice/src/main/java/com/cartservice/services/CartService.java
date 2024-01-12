package com.cartservice.services;

import java.util.List;

import com.cartservice.dto.CartDto;
import com.cartservice.dto.CartList;
import com.cartservice.entities.Cart;
import com.cartservice.exceptions.CartNotFoundException;

public interface CartService {
	public CartList getByCustId(int custId);

	public CartList getAll();
	
	public Cart getById(int cartId) throws CartNotFoundException;

	public String addCart(Cart cart);

	public String updateCart(CartDto cartDto, int id) throws CartNotFoundException;

	public String deleteCart(int id) throws CartNotFoundException;
}
