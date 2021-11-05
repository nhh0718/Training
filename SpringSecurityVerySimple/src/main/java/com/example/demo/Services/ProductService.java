package com.example.demo.Services;

import com.example.demo.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct();
}
