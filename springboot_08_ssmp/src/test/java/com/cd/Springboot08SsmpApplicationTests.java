package com.cd;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cd.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08SsmpApplicationTests {
	@Autowired
	private BookDao bookDao;
	@Test
	void contextLoads() {
		Page page = new Page(1, 5);
		bookDao.selectPage(page,null);
	}

}
