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

@WebServlet("/MovieInfoServlet")
public class MovieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MovieInfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String tvTitle = request.getParameter("tvTitle");
		String tvActors = request.getParameter("tvActors");
		String tvGenre = request.getParameter("tvGenre");
		String tvFeature = request.getParameter("tvFeature");
		String tvStory = request.getParameter("tvStory");
		String tvOpendate = request.getParameter("tvOpendate");
		String tvGrade = request.getParameter("tvGrade");

		YedamFlixDAO dao = new YedamFlixDAO();
		List<TV> tlist = dao.getTvList();
		
		Gson gson = new GsonBuilder().create();
		response.getWriter().println(gson.toJson(tlist));
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
