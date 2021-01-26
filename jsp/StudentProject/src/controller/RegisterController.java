package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.StudentDTO;
import model.ModelAndView;
import service.StudentService;

public class RegisterController implements Controller {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		int major = Integer.parseInt(request.getParameter("major"));
		int score = Integer.parseInt(request.getParameter("score"));
		int mno = Integer.parseInt(request.getParameter("mno"));
		String mname = request.getParameter("mname");
		
		int count = StudentService.getInstance().insertMajor(new StudentDTO(sno, name, major, score, mno, mname));
		try {
			response.getWriter().write(String.valueOf(count));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
