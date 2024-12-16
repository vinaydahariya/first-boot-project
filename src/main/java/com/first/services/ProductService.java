package com.first.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public  void createProduct(){

        System.out.println("Creating Product");
        System.out.println("Product Created");
    }


    // create
        // product ko app create kr rhe hai
        // logging
        // security
        // transaction management

    // get
    public void gettingProduct(){
        System.out.println("getting product");
        System.out.println("Got");
    }

    // search
    public void searchProduct(){
        System.out.println("searching product");
        System.out.println("got");
    }

}
