package app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContentinfoDAO extends DAO {

	public List<Content> TVcontent() {
		connect();
		List<Content> list = new ArrayList<>();
		String sql = "select * from content where mOrTv='tv'";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Content vo = new Content();
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setActors(rs.getString("actors"));
				vo.setGenre(rs.getString("genre"));
				vo.setFeature(rs.getString("feature"));
				vo.setStory(rs.getString("story"));
				vo.setOpendate(rs.getString("opendate"));
				vo.setGrade(rs.getString("grade"));
				vo.setmOrTv(rs.getString("mOrtv"));
				vo.setImage(rs.getString("image"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	public List<Content> TvRandom() {
		connect();
		List<Content> list = new ArrayList<>();
		String sql = "select * from (select * from content\r\n"
				+ "                        where mOrTv='tv'\r\n"
				+ "                        order by dbms_random.value)\r\n"
				+ "         where rownum <= 1";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Content vo = new Content();
				vo.setCode(rs.getInt("code"));
				vo.setTitle(rs.getString("title"));
				vo.setActors(rs.getString("actors"));
				vo.setGenre(rs.getString("genre"));
				vo.setFeature(rs.getString("feature"));
				vo.setStory(rs.getString("story"));
				vo.setOpendate(rs.getString("opendate"));
				vo.setGrade(rs.getString("grade"));
				vo.setmOrTv(rs.getString("mOrtv"));
				vo.setImage(rs.getString("image"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
}
