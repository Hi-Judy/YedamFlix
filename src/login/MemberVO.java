package login;

public class MemberVO {
	private int num;
	private String id;
	private String pw;
	private String name;
	private String phoneNb;
	private String email;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNb() {
		return phoneNb;
	}
	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", phoneNb=" + phoneNb
				+ ", email=" + email + "]";
	}
	
	
}
