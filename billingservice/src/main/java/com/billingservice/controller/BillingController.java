package com.billingservice.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.billingservice.response.Bill;
import com.billingservice.response.Cart;
import com.billingservice.response.CartList;
import com.billingservice.response.Item;

@RestController
@RequestMapping(path = "/billing")
public class BillingController {

	private RestTemplate restTemplate = new RestTemplate();

	@GetMapping("{custId}")
	public Bill getBill(@PathVariable(name = "custId") int custId) throws RestClientException, URISyntaxException {
		Bill createBill = new Bill();
		double bill = 0;
		int totalQuantity = 0;
		Map<Item, Integer> items = new HashMap<>();
		CartList cartList = restTemplate
				.getForObject(new URI("http://localhost:8082/cartservice/carts/customer/" + custId), CartList.class);
		for (Cart cart : cartList.getCartList()) {
			int itemId = cart.getItemId();
			Item item = restTemplate.getForObject(new URI("http://localhost:8081/itemservice/items/" + itemId),
					Item.class);
			double price = item.getPrice();
			int quantity = cart.getQuantity();
			items.put(item, quantity);
			bill += (quantity * price);
			totalQuantity += quantity;
		}
		createBill.setPurchasedItems(items);
		createBill.setTotalQuantity(totalQuantity);
		createBill.setTotalAmount(bill);
		return createBill;
	}

}
