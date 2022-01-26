package com.cd.dao;

import com.cd.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author cdviviany
 * @version 1.00
 */
@Mapper
@Repository
public interface UserDao {
    @Select("select * from user where id = #{id}")
    User getById(Integer id);
}
