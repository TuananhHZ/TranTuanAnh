package com.laptrinhJava.demo.repository;

import com.laptrinhJava.demo.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
        List findByNameContainingIgnoreCase(String productName);
}


