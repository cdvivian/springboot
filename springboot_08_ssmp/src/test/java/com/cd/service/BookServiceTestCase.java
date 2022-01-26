package com.cd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cd.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author cdviviany
 * @version 1.00
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;
    @Test
    public void test1(){
    bookService.getById(5);
    }
    @Test
    public void test2(){
        Book book = new Book();
        book.setName("小红帽");
        book.setDescription("狼外婆吃小红帽");
        book.setType("儿童童话");
        bookService.save(book);
    }
    @Test
    public void test3(){
        bookService.list();
    }
    @Test
    public void test4(){
        bookService.page(new Page<>(3, 2));

    }
    @Test
    public void test5(){
        bookService.removeById(5);
    }
}
