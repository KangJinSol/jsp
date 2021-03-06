package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.StudentDTO;
import model.ModelAndView;
import service.StaffService;
import service.StudentService;

public class RefreshController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<StudentDTO> list = StudentService.getInstance().selectAllStudent();
		ArrayList<String> major = StudentService.getInstance().selectAllMajorList();
		request.getSession().setAttribute("major", major);
		request.getSession().setAttribute("list", list);
		return new ModelAndView("university_manager.jsp", true);
	}

}
