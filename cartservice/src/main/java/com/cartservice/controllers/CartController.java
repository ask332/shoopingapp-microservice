package com.cartservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.dto.CartDto;
import com.cartservice.dto.CartList;
import com.cartservice.entities.Cart;
import com.cartservice.exceptions.CartNotFoundException;
import com.cartservice.services.CartService;

@RestController
@RequestMapping(path = "/carts")
public class CartController {
	@Autowired
	private CartService cartService;

	@GetMapping(path = "/customer/{custId}")
	public CartList getByCustId(@PathVariable(name = "custId") int custId) {
		return cartService.getByCustId(custId);
	}

	@GetMapping(path = "/")
	public CartList getAll() {
		return cartService.getAll();
	}

	@GetMapping(path = "{cartId}")
	public Cart getById(@PathVariable(name = "cartId") int cartId) throws CartNotFoundException {
		return cartService.getById(cartId);
	}

	@PostMapping(path = "/")
	public String addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart);
	}

	@PutMapping(path = "{id}")
	public String updateCart(@RequestBody CartDto cartDto, @PathVariable(name = "id") int id)
			throws CartNotFoundException {
		return cartService.updateCart(cartDto, id);
	}

	@DeleteMapping(path = "{id}")
	public String deleteCart(@PathVariable(name = "id") int id) throws CartNotFoundException {
		return cartService.deleteCart(id);
	}
}
