package product;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.ProductDAO;
import dto.ProductDTO;

/**
 * Servlet implementation class ProductInputServlet
 */
@WebServlet("/register.do")
public class ProductInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String pno = request.getParameter("pno");
		String pname = request.getParameter("pname");
		int price = Integer.parseInt(request.getParameter("price"));
		int ea = Integer.parseInt(request.getParameter("ea"));
		String maker = request.getParameter("maker");
		
		try {
		if(pno.length() < 12) throw new Exception();
			ProductDAO.getInstacne().insertProduct(new ProductDTO(pno, pname, price, ea, maker));
			ArrayList<ProductDTO> list = ProductDAO.getInstacne().selectProductAllList();
			JSONArray arr = new JSONArray(list);
			JSONObject obj = new JSONObject();
			obj.put("result", arr);
			response.getWriter().write(obj.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			response.setStatus(1002);
			response.getWriter().write("입력한 데이터 오류");
		}catch (Exception e) {
			response.setStatus(1001);
			response.getWriter().write("물품 번호는 12자리 미만입니다");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
