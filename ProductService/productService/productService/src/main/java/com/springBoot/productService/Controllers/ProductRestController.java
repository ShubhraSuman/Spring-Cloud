package com.springBoot.productService.Controllers;

import com.springBoot.productService.Repo.ProductRepo;
import com.springBoot.productService.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
    @Autowired
    private ProductRepo repo;

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public Product create(@RequestBody Product product)
    {
        return repo.save(product);
    }
}
