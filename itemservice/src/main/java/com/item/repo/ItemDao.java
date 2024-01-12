package com.item.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.item.entities.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

}
