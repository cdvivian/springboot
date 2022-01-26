package com.cd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cd.controller.utils.R;
import com.cd.domain.Book;
import com.cd.service.IBookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;
    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }
    @PostMapping
    public R save(@RequestBody Book book){
        boolean flag = bookService.save(book);
        return new R(flag,flag ? "添加成功(●'◡'●)" : "添加失败/(ㄒoㄒ)/~~");
    }
    @PutMapping
    public R update(@RequestBody Book book){
        boolean flag = bookService.updateById(book);
        return new R(flag,flag ? "修改成功(●'◡'●)" : "修改失败/(ㄒoㄒ)/~~");

    }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        boolean flag = bookService.removeById(id);
        return new R(flag,flag ? "删除成功(●'◡'●)" : "删除失败/(ㄒoㄒ)/~~");
    }
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

//    @GetMapping("/{currentPage}/{pageSize}")
//    public R getByPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
//        IPage<Book> pageBook = bookService.getPage(currentPage, pageSize);
//        if (currentPage > pageBook.getPages()){
//            pageBook = bookService.getPage((int)pageBook.getPages(),pageSize);
//        }
//        return new R(true ,pageBook);
//    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize,Book book){
        IPage<Book> pageBook = bookService.getPage(currentPage, pageSize,book);
        if (currentPage > pageBook.getPages()){
            pageBook = bookService.getPage((int)pageBook.getPages(),pageSize,book);
        }
        return new R(true ,pageBook);
    }

}
