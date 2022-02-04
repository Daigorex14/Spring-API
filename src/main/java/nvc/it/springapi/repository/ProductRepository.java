package nvc.it.springapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.springapi.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
    public List<Product> findByNameContaining(String name);
    
}
