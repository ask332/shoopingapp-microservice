package com.cartservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartservice.entities.Cart;

public interface CartDao extends JpaRepository<Cart, Integer>{
	public List<Cart> getByCustId(int id);
}
