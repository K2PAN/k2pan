package com.k2pan.api.controllers.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k2pan.api.models.ecommerce.Category;
import com.k2pan.api.models.ecommerce.CategoryRepository;
import com.k2pan.api.models.ecommerce.Product;
import com.k2pan.api.models.ecommerce.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
