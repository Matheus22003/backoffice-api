package com.github.matheussimoes.repository;

import com.github.matheussimoes.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository {
    private final Map<Long, Product> db = new HashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Product> findAll() {
        return new ArrayList<>(db.values());
    }

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(counter.getAndIncrement());
        }
        db.put(product.getId(), product);
        return product;
    }

    public void delete(Long id) {
        db.remove(id);
    }

    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(db.get(id));
    }
}