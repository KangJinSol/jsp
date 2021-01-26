package service;

import java.util.ArrayList;

import dao.StaffDAO;
import dto.StaffDTO;

public class StaffService {
	private static StaffService instance = new StaffService();
	private static StaffDAO dao;
	
	private StaffService() {
		dao = StaffDAO.getInstance();
	}
	
	public static StaffService getInstance() {
		if(instance==null)
			instance= new StaffService();
		return instance;
	}

	public StaffDTO login(String id, String pass) {
		return dao.login(id, pass);
	}

	public ArrayList<StaffDTO> selectAllStaff() {
		return dao.selectAllStaff();
	}
	

}
