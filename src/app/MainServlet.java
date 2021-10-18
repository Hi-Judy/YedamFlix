package app;

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

import co.yedam.common.Movie;
import co.yedam.common.TV;
import co.yedam.common.YedamFlixDAO;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MainServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		YedamFlixDAO dao = YedamFlixDAO.getInstance();
		
		if(cmd == null) {
			out.println("<h1>메인 페이지 입니다.</h1>");
			
		} else if(cmd.equals("tv")) {
			System.out.println("<h1>tv페이지 입니다.</h1>");
			List<TV> tlist = dao.getTvList();
			out.println(tlist);
			
		} else if(cmd.equals("movie")) {
			System.out.println("<h1>영화페이지 입니다.</h1>");
			List<Movie> mlist = dao.getMvList();
			out.println(mlist);

		} else if(cmd.equals("login")) {
			System.out.println("<h1>로그인페이지 입니다.</h1>");
			
		} else if(cmd.equals("register")) {
			System.out.println("<h1>가입페이지 입니다.</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
