package net.kzn.amazingbackend.dao;

import java.util.List;

import net.kzn.amazingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
