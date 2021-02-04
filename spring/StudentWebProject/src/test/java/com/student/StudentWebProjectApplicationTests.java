package com.student;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentWebProjectApplicationTests {
	@Autowired
	StudentMapper mapper;
		
	@DisplayName("학생정보 검색 테스트")
	@Test
	public void searchTest() {
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("kind", "name");
		map.put("name", "수");
		if(0 == mapper.selectStudentMode(map).size())
			fail("학생정보 검색 테스트 실패");
	}
		

}
