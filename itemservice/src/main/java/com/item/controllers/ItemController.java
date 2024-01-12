package com.item.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.dto.ItemDto;
import com.item.dto.ItemList;
import com.item.entities.Item;
import com.item.exceptions.ItemNotFoundException;
import com.item.services.ItemService;

@RestController
@RequestMapping(path = "/items")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@GetMapping(path = "/")
	public ItemList getAll() {
		return itemService.getAll();
	}

	@GetMapping(path = "/{id}")
	public Item getById(@PathVariable(name = "id") int id) throws ItemNotFoundException {
		return itemService.findById(id);
	}

	@PostMapping(path = "/")
	public String addItem(@RequestBody Item item) {
		return itemService.addItem(item);
	}

	@PutMapping(path = "/{id}")
	public String updateItem(@PathVariable(name = "id") int id, @RequestBody ItemDto itemDto)
			throws ItemNotFoundException {
		return itemService.updateItem(id, itemDto);
	}

	@DeleteMapping(path = "/{id}")
	public String deleteItem(@PathVariable(name = "id") int id) throws ItemNotFoundException {
		return itemService.deleteItem(id);
	}
}
