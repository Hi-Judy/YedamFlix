package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/DetailPageServlet2")
public class DetailPageServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailPageServlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Gson gson = new GsonBuilder().create();
		
		YedamFlixDAO2 dao = new YedamFlixDAO2();
		String code = request.getParameter("code");
		
		String content = dao.getDetailContent(code);

		System.out.println(content);
		
		response.getWriter().println(gson.toJson(content));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
