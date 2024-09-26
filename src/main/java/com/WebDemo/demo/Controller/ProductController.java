package com.WebDemo.demo.Controller;

import com.WebDemo.demo.Product;
import com.WebDemo.demo.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductSevice service;
    @GetMapping("/products")

    public List<Product> getProducts(){

   return service.getProducts();

    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){

        service.addProduct(prod);

    }


}
