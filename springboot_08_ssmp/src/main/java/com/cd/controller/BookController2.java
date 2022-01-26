package com.cd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cd.domain.Book;
import com.cd.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
//@Controller
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;
    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }
    @GetMapping("{/id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }
    @GetMapping("/{currentPage}/{size}")
    public IPage getByPage(@PathVariable int currentPage,int size){
        return bookService.getPage(currentPage,size);
    }

}
