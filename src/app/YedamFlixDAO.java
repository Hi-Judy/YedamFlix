package app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YedamFlixDAO extends DAO{
	
	private static YedamFlixDAO singleton = new YedamFlixDAO();
	
	public YedamFlixDAO() {}
	
	public static YedamFlixDAO getInstance() {
		return singleton;
	}
	//tv 목록 가져오기
	public TV getTvList(String mOrTv){
		connect();
		String sql = "select * from content where mOrTv=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,mOrTv);
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				TV tv = new TV();
				tv.settTitle(rs.getString("tvtitle"));
				tv.settActors(rs.getString("actors"));
				tv.settGenre(rs.getString("genre"));
				tv.settFeature(rs.getString("feature"));
				tv.settStoty(rs.getString("story"));
				tv.settOpendate(rs.getString("opendate"));
				tv.settGrade(rs.getString("grade"));
				tv.
				return tv;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
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
