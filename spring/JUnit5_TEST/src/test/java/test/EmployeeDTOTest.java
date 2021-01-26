package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dao.EmployeeDAO;

class EmployeeDTOTest {
	
	
	@BeforeEach //각 테스트 메서드가 실행 전에 실행
	void setUp() throws Exception {
		System.out.println("테스트 작업전 수행");
	}
	
	@DisplayName("사원정보리스트 조회 테스트")
	@Test
	void testSelectEmployeeList() {
		String str = EmployeeDAO.getInstance().selectEmployeeList(7);
		if(str.length()==2)
		fail("데이터가 없습니다.");//작업 실패시 나타낼 행동
		else
			System.out.println(str);
	}
	
	@DisplayName("하위연봉5명 조회 테스트")
	@Test
	void testSelectBottom5Salary() {
		System.out.println("testSelectBottom5Salary");
		fail("Not yet implemented");
	}
	@AfterEach //각 테스트 메서드가 실행이 끝난 후에 실행
	void end() {
		System.out.println("테스트 작업 후 실행");
	}

}