package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/AddFileServlet")
public class AddFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddFileServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phoneNb = request.getParameter("phoneNb");
		String email = request.getParameter("email");

		//System.out.printf(id, pw, name, phoneNb, email);
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.uploadFile(id, pw, name, phoneNb, email);

		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(vo));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
