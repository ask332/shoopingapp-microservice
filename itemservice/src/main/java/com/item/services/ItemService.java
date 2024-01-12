package com.item.services;

import com.item.dto.ItemDto;
import com.item.dto.ItemList;
import com.item.entities.Item;
import com.item.exceptions.ItemNotFoundException;

public interface ItemService {
	public ItemList getAll();

	public Item findById(int id) throws ItemNotFoundException;

	public String addItem(Item item);

	public String updateItem(int id, ItemDto itemDto) throws ItemNotFoundException;

	public String deleteItem(int id) throws ItemNotFoundException;
}
