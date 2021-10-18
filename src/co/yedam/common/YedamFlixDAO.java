package co.yedam.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YedamFlixDAO extends DAO{
	
	private static YedamFlixDAO singleton = new YedamFlixDAO();
	
	private YedamFlixDAO() {}
	
	public static YedamFlixDAO getInstance() {
		return singleton;
	}
	
	//tv 목록 가져오기
	public List<TV> getTvList(){
		connect();
		List<TV> tlist = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select*from tv order by 1");
			while(rs.next()) {
				TV tv = new TV();
				tv.settTitle(rs.getString("tvTitle"));
				tv.settActors(rs.getString("tvActors"));
				tv.settGenre(rs.getString("tvGenre"));
				tv.settFeature(rs.getString("tvFeature"));
				tv.settStoty(rs.getString("tvStory"));
				tv.settOpendate(rs.getString("tvOpendate"));
				tv.settGrade(rs.getString("tvGrade"));
				tlist.add(tv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return tlist;
		
	}
	
	//영화 목록 가져오기
	public List<Movie> getMvList(){
		connect();
		List<Movie> mlist = new ArrayList<>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select*from movie order by 1");
			while(rs.next()) {
				Movie mv = new Movie();
				mv.setmTitle(rs.getString("mvTitle"));
				mv.setmActors(rs.getString("mvActors"));
				mv.setmGenre(rs.getString("mvGenre"));
				mv.setmFeature(rs.getString("mvFeature"));
				mv.setmStoty(rs.getString("mvStory"));
				mv.setmOpendate(rs.getString("mvOpendate"));
				mv.setmGrade(rs.getString("mvGrade"));
				mlist.add(mv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mlist;
		
	}
}
