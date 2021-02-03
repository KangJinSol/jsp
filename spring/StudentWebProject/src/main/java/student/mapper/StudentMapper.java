package student.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import student.dto.StudentDTO;

@Mapper
public interface StudentMapper {
	StudentDTO selectStudent(String sno, String name, String major);
	List<StudentDTO> selectAllStudent();
	List<StudentDTO> selectSearchStudent(HashMap<String, Object> map);
	int insertLog(HashMap<String, Object> map);
}
