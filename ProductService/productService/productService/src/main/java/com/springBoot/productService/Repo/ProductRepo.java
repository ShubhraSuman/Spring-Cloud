package com.springBoot.productService.Repo;

import com.springBoot.productService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
