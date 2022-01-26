package com.cd.dao.impl;

import com.cd.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author cdviviany
 * @version 1.00
 */
@Repository
public class BookImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is running");
    }
}
