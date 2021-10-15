package co.yedam.login;

import java.sql.SQLException;

import co.yedam.common.DAO;

public class MemberDAO extends DAO{

	// 회원등록
	public MemberVO uploadFile(String id, String pw, String name, String phoneNb, String email) {
		connect();
		String sql = "insert into ydflix values(?,?,?,?,?)";
		
		try {
			int nextNum = -1;
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select nvl (max(num),0)+1 from ydfli");
			if(rs.next()) {
				nextNum = rs.getInt(1);
			}
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, nextNum);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			psmt.setString(4, name);
			psmt.setString(5,phoneNb);
			psmt.setString(6, email);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력."); 
			
			MemberVO vo = new MemberVO();
			vo.setNum(nextNum);
			vo.setId(id);
			vo.setPw(pw);
			vo.setName(name);
			vo.setPhoneNb(phoneNb);
			vo.setEmail(email);
			return vo;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
			
		} finally {
			disconnect();
		}
	}
}
