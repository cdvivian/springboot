package com.cd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cd.dao.BookDao;
import com.cd.domain.Book;
import com.cd.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cdviviany
 * @version 1.00
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize) {
        Page<Book> page = new Page<>(currentPage, pageSize);
        Page<Book> bookPage = bookDao.selectPage(page, null);
        return bookPage;
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize, Book queryBook) {
        Page page = new Page(currentPage, pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(queryBook.getName()),Book::getName,queryBook.getName());
        lqw.like(Strings.isNotEmpty(queryBook.getType()),Book::getType,queryBook.getType());
        lqw.like(Strings.isNotEmpty(queryBook.getDescription()),
                Book::getDescription,queryBook.getDescription());
        return bookDao.selectPage(page,lqw);
    }
}
