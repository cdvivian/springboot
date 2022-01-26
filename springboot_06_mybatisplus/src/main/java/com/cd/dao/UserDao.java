package com.cd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cd.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author cdviviany
 * @version 1.00
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {
}
