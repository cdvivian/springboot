package com.cd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cdviviany
 * @version 1.00
 */
 @RestController
 @RequestMapping("/books")
public class BookController {
     @GetMapping
     public String getById(){
         System.out.println("springboot is running");
         return "Springboot is running";
     }
}
