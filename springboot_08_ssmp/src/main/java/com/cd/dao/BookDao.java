package com.cd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cd.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author cdviviany
 * @version 1.00
 */
@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {
}
