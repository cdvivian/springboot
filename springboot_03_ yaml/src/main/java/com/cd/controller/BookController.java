package com.cd.controller;

import com.cd.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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
     //读取yml里的数据
     @Value("${country}")
     private String country1;

    @Value("${user1.name}")
    private String name;

    @Value("${likes[1]}")
    private String hobby;
    //使用自动装配，所有对象自动装配到environment
    @Autowired
    private Environment environment;
    @Autowired
    private MyDataSource myDataSource;
     @GetMapping
     public String getById(){
         System.out.println("springboot is running");
         System.out.println("country1=====" + country1);
         System.out.println("姓名=====" + name);
         System.out.println("爱好=====" + hobby);
         System.out.println("环境变量" + environment.getProperty("likes[0]"));
         System.out.println("----------------------");
         System.out.println(myDataSource);
         return "Springboot is running222222222";
     }
}
