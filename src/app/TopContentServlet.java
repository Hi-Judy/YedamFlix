package app;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/TopContentServlet")
public class TopContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TopContentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String topContent = request.getParameter("topContent");
		System.out.println(topContent);
		
		YedamFlixDAO2 dao = new YedamFlixDAO2();
		List<Content> tclist = dao.getTopContent(topContent);
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(tclist));
		
		System.out.println(tclist);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
