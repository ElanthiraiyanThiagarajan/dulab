package com.dulab.master.service;

import com.dulab.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Product product);

    List< Product > getAllProduct();

    Product getProductById(Integer productId);

    void deleteProduct(Integer id);
}
