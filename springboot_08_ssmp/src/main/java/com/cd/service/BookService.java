package com.cd.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cd.domain.Book;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface BookService {
    boolean save(Book book);
    boolean delete(Integer id);
    boolean update(Book book);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage, int pageSize);
}
