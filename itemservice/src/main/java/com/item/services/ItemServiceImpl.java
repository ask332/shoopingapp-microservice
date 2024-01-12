package com.item.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.dto.ItemDto;
import com.item.dto.ItemList;
import com.item.entities.Item;
import com.item.exceptions.ItemNotFoundException;
import com.item.repo.ItemDao;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	@Override
	public ItemList getAll() {
		return new ItemList(itemDao.findAll());
	}

	@Override
	public Item findById(int id) throws ItemNotFoundException {
		Item item = itemDao.findById(id)
				.orElseThrow(() -> new ItemNotFoundException("Item with id: " + " not found!!"));
		return item;
	}

	@Override
	public String addItem(Item item) {
		itemDao.save(item);
		return "item saved with id: " + item.getItemId() + " successfully!!!";
	}

	@Override
	public String updateItem(int id, ItemDto itemDto) throws ItemNotFoundException {
		Item item = itemDao.findById(id)
				.orElseThrow(() -> new ItemNotFoundException("Item cannot be found to update!!!"));
		item.setName(itemDto.getName());
		item.setPrice(itemDto.getPrice());
		item.setCategory(itemDto.getCategory());
		return "Item with id: " + id + " updated successfully!!!";
	}

	@Override
	public String deleteItem(int id) throws ItemNotFoundException {
		Item itemToDelete = itemDao.findById(id)
				.orElseThrow(() -> new ItemNotFoundException("Item with id: " + id + " cannot found for deletion!!!"));
		itemDao.delete(itemToDelete);
		return "Item with id: " + id + " deleted successfully!!!";
	}

}
