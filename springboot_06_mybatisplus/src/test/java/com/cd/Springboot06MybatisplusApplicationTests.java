package com.cd;

import com.cd.dao.UserDao;
import com.cd.domain.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Springboot06MybatisplusApplicationTests {
	@Autowired
	private UserDao userDao;
	@Test
	void contextLoads() {
		User user = userDao.selectById(2);
		System.out.println(user);
	}

}
