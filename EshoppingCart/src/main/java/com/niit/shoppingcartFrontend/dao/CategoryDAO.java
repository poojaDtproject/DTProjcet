package com.niit.shoppingcartFrontend.dao;



import java.util.List;

import com.niit.shoppingcartFrontend.Model.Category;



public interface CategoryDAO {

	public Category get(String id);

	public Category getByName(String name);

	public boolean saveOrUpdate(Category category);

	public boolean delete(String id);

	public List<Category> list();

}
