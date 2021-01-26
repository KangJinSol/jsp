package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.StaffDTO;
import model.ModelAndView;
import service.StaffService;

public class LoginController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pass =request.getParameter("pass");
		ModelAndView view = null;
		StaffDTO dto = StaffService.getInstance().login(id,pass);
		
		if(dto != null) {
			request.getSession().setAttribute("dto", dto);
			if(dto.getStatus() == 1) {
				request.getSession().setAttribute("dto", dto);
				ArrayList<StaffDTO> list = StaffService.getInstance().selectAllStaff();
				request.getSession().setAttribute("list", list);
			}
			view = new ModelAndView("university_manager.jsp", true);
		}else {
			try {
				response.getWriter().append("<script>alert('아이디 비밀번호를 확인하세요.');"
							+"history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return view;
	}

	
}