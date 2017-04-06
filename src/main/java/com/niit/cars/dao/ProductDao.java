package com.niit.cars.dao;

import java.util.List;

import com.niit.cars.model.Product;

public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
