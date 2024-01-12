package com.item.dto;

import java.util.List;

import com.item.entities.Item;

public class ItemList {
	private List<Item> ItemList;

	public ItemList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemList(List<Item> itemList) {
		super();
		ItemList = itemList;
	}

	public List<Item> getItemList() {
		return ItemList;
	}

	public void setItemList(List<Item> itemList) {
		ItemList = itemList;
	}

}
