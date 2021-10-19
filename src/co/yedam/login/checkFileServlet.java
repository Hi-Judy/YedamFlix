package co.yedam.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/checkFileServlet")
public class checkFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public checkFileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		Gson gson = new GsonBuilder().create();

		MemberDAO dao = new MemberDAO();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.printf(id + ',' + pw);
		int list = dao.checkListById(id,pw);

		System.out.println(list);
		
		out.println(gson.toJson(list));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
