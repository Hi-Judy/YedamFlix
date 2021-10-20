package tv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import app.Content;
import app.YedamFlixDAO;

@WebServlet("/DetailContentServlet")
public class DetailContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DetailContentServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String code = request.getParameter("code");
		System.out.println(code);
		
		YedamFlixDAO dao = new YedamFlixDAO();
		Content content = new Content();
		
		content = dao.getDetailContent(code);
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(content));
		
		System.out.println(content);
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
