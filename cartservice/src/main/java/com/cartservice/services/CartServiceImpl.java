package com.cartservice.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartservice.dto.CartDto;
import com.cartservice.dto.CartList;
import com.cartservice.entities.Cart;
import com.cartservice.exceptions.CartNotFoundException;
import com.cartservice.repo.CartDao;

@Service
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao cartDao;

	@Override
	public CartList getByCustId(int custId) {
		CartList cartList = new CartList(cartDao.getByCustId(custId));
		return cartList;
	}

	@Override
	public CartList getAll() {
		return new CartList(cartDao.findAll());
	}

	@Override
	public Cart getById(int cartId) throws CartNotFoundException {
		Cart cart = cartDao.findById(cartId)
				.orElseThrow(() -> new CartNotFoundException("Cart with id: " + cartId + " not found!!"));
		return null;
	}

	@Override
	public String addCart(Cart cart) {
		cartDao.save(cart);
		return "Items added to cart with id: " + cart.getCartId() + " successfully!!";
	}

	@Override
	public String updateCart(CartDto cartDto, int id) throws CartNotFoundException {
		Cart cartToUpdate = cartDao.findById(id)
				.orElseThrow(() -> new CartNotFoundException("Cart with id: " + id + " not found!!"));
//		cartToUpdate.setCustId(cartDto.getCustId());
		cartToUpdate.setItemId(cartDto.getItemId());
		cartToUpdate.setQuantity(cartDto.getQuantity());
		return "Cart with id: " + id + " updated successfully!!";
	}

	@Override
	public String deleteCart(int id) throws CartNotFoundException {
		Cart cart = cartDao.findById(id)
				.orElseThrow(() -> new CartNotFoundException("Cart with id: " + id + " not found!!"));
		cartDao.delete(cart);
		return "Cart with id: " + id + " deleted successfully!!";
	}

}
