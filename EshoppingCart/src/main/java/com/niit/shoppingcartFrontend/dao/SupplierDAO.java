package com.niit.shoppingcartFrontend.dao;

import java.util.List;

import com.niit.shoppingcartFrontend.Model.Supplier;

/*import com.niit.model.Supplier;*/

public interface SupplierDAO {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public boolean saveOrUpdate(Supplier supplier);

	public boolean delete(String id);

	public Supplier get(String id);

	public Supplier getByName(String name);

	public List<Supplier> list();
}