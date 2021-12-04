package com.example.product.Service;

import com.example.product.Model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(long id);

    List<Product> findAllProducts();
}
