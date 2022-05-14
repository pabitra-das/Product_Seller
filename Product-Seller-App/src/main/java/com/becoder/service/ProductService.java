package com.becoder.service;


import com.becoder.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(long id);

    List<Product> findAllProduct();
}
