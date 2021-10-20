package app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YedamFlixDAO2 extends DAO{
	
	private static YedamFlixDAO2 singleton = new YedamFlixDAO2();
	
	public YedamFlixDAO2() {}
	
	public static YedamFlixDAO2 getInstance() {
		return singleton;
	}
	
	//컨텐츠 목록 가져오기
	public List<Content> getContent(String mOrTv){
		connect();
		List<Content> clist = new ArrayList<>();
		String sql = "select * from content where mOrTv=nvl(?, mOrTv)";
		System.out.println("aaa:"+sql);
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,mOrTv);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				Content content = new Content();
				content.setCode(rs.getString("code"));
				content.setTitle(rs.getString("title"));
				content.setActors(rs.getString("actors"));
				content.setGenre(rs.getString("genre"));
				content.setFeature(rs.getString("feature"));
				content.setStory(rs.getString("story"));
				content.setOpendate(rs.getString("opendate"));
				content.setGrade(rs.getString("grade"));
				content.setImage(rs.getString("image"));
				clist.add(content);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return clist;
	}
	
	
	//상세목록 가져오기
	public String getDetailContent(String code){
		connect();
		String sql = "select * from content where code=nvl(?, code)";
		Content content = new Content();
		System.out.println("bbb"+sql);
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,code);
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				content.setCode(rs.getString("code"));
				content.setTitle(rs.getString("title"));
				content.setActors(rs.getString("actors"));
				content.setGenre(rs.getString("genre"));
				content.setFeature(rs.getString("feature"));
				content.setStory(rs.getString("story"));
				content.setOpendate(rs.getString("opendate"));
				content.setGrade(rs.getString("grade"));
				content.setImage(rs.getString("image"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	
	

	//top컨텐츠 가져오기
	public List<Content> getTopContent(String topContent){
		connect();
		List<Content> tclist = new ArrayList<>();
		String sql = "select * from content where topContent=nvl(?, topContent)";
		System.out.println("cc"+sql);
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,topContent);
			rs=psmt.executeQuery();
			
			while(rs.next()) {
				Content content = new Content();
				content.setCode(rs.getString("code"));
				content.setTitle(rs.getString("title"));
				content.setActors(rs.getString("actors"));
				content.setGenre(rs.getString("genre"));
				content.setFeature(rs.getString("feature"));
				content.setStory(rs.getString("story"));
				content.setOpendate(rs.getString("opendate"));
				content.setGrade(rs.getString("grade"));
				content.setImage(rs.getString("image"));
				tclist.add(content);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return tclist;
	}
	
	
	//클릭
	

}
