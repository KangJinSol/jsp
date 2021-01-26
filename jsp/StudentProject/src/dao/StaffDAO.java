package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.StaffDTO;

public class StaffDAO {
	private static StaffDAO instance = new StaffDAO();
	private DBManager manager;
	private Connection conn;
	private StaffDAO() {
		manager = DBManager.getInstance();
		conn = manager.getConn();
	}
	
	public static StaffDAO getInstance() {
		if(instance == null)
			instance = new StaffDAO();
		return instance;
	}
	
	public StaffDTO login(String id, String pass) {
		StaffDTO dto = null;
		String sql = "select * from edu_person where id like ? and pass like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			try {
				pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pass);
				rs = pstmt.executeQuery();
				System.out.println(id + " " + pass);
				if(rs.next()) {
					dto = new StaffDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return dto;
	}

	public ArrayList<StaffDTO> selectAllStaff() {
		String sql = "select id, pass, name, position, status from edu_person";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<StaffDTO> list = new ArrayList<StaffDTO>();
		try {
			pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				list.add(new StaffDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
}
