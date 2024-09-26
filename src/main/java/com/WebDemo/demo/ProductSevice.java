package com.WebDemo.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service

public class ProductSevice {
List<Product>Products=new ArrayList<>(Arrays.asList(new Product(10,"realme",100000),new Product(20,"iphone",20000000),new Product(30,"samsung",3000000)));


    public List<Product> getProducts(){

        return new ArrayList<>(Arrays.asList(new Product(10,"realme",100000),new Product(20,"iphone",20000000),new Product(30,"samsung",3000000)));
    }
    public  void addProduct(@RequestBody Product prod){
       // System.out.println("it is adding bro");
        System.out.println(prod);
        Products.add(prod);
    }



}
