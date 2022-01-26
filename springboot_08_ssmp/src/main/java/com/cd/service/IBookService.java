package com.cd.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cd.domain.Book;
import org.springframework.stereotype.Service;

/**
 * @author cdviviany
 * @version 1.00
 */

public interface IBookService extends IService<Book> {
    IPage<Book> getPage(Integer currentPage,Integer pageSize);
    IPage<Book> getPage(Integer currentPage,Integer pageSize,Book book);
}
