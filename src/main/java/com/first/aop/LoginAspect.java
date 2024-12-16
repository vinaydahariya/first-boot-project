package com.first.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    // cross cutting concerns
    // execution: type of AOP advice - method execution
    // * matches any return type
    // com.first.services.ProductService: fully qualified class name where method is defined
    // createProduct: matches the method name
    // (..) matches any number of arguments
    @Before("execution(* com.first.services.ProductService.*(..))")
    public void greeting(){
        System.out.println("Hi, method starting...");
    }

    @After("execution(* com.first.services.ProductService.*(..))")
    public void byeBye(){
        System.out.println("Bye-Bye, Terminating method");
    }


}
