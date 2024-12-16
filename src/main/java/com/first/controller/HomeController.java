package com.first.controller;

import com.first.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.Student;

@RestController
public class HomeController {

    @Autowired
    private Student student;

    @Autowired
    private ProductService productService;

    @RequestMapping("/magic")
   public String test() throws InterruptedException {
        Thread.sleep(3000);
        productService.createProduct();
       return "This is magic";
   }

   @RequestMapping("/another")
   public String test2(){
        productService.searchProduct();
        return "This is actually magic";
   }

   @RequestMapping("/sandeep")
    public String name(){
        return "I am Sandeep Gautam";
   }

}
