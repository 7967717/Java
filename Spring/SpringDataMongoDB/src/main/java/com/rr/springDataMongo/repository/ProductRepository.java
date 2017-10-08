package com.rr.springDataMongo.repository;

import com.rr.springDataMongo.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author roman.rudenko on 14-Apr-16.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>, ProductRepositoryCustom {
}
