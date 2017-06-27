package com.joins;

import com.joins.mappers.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserMapper mapper;

	@Test
	public void testMybatis() throws Exception {
		mapper.insert();
		String result = mapper.select();

		System.out.println("testMybatis : " + result);
	}

}
