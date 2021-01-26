package service;

import java.util.ArrayList;

import dao.StudentDAO;
import dto.StaffDTO;
import dto.StudentDTO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private static StudentDAO dao;
	
	private StudentService() {
		dao = StudentDAO.getInstance();
	}
	
	public static StudentService getInstance() {
		if(instance==null)
			instance= new StudentService();
		return instance;
	}
	
	public ArrayList<StudentDTO> selectSearchStudent(String kind, String search) {
		return dao.selectSearchStudent(kind,search);
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		return dao.selectAllStudent();
	}
	

	public ArrayList<StudentDTO> SearchScore() {
		return dao.SearchScore();
	}

	public int insertMajor(StudentDTO studentDTO) {
		int count = dao.insertMajor(studentDTO);
		if(count == 0 ) return 0;
		return dao.insertMajor(studentDTO);
	}
	

	public int updateMajor(StudentDTO staffDTO) {
		return dao.updateMajor(staffDTO);
	}

	public int deleteMajor(int mno) {
		return dao.deleteMajor(mno);
	}
	
	public static ArrayList<String> selectAllMajorList() {
		return dao.selectAllMajorList();
	}


}
