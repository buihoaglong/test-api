package com.btec.webquanlybainhac.repositories;
import com.btec.webquanlybainhac.entities.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    // You can define custom query methods here if needed
}
