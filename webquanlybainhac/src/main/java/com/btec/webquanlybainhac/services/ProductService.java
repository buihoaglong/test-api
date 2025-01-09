package com.btec.webquanlybainhac.services;

import com.btec.webquanlybainhac.entities.Product;
import com.btec.webquanlybainhac.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create or update a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get a list of all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by its ID
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    // Delete a product by its ID
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
