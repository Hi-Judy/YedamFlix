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


@WebServlet("/ContentServlet")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ContentServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String mOrTv = request.getParameter("mOrTv");
		System.out.println(mOrTv);
		
		YedamFlixDAO dao = new YedamFlixDAO();
		List<Content> clist = dao.getContent(mOrTv);
				
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(clist));
		
		System.out.println(clist);
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
