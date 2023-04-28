package member;

public class Member {
// Java Beans : 모든 변수 private, getter/setter, 기본생성자

	private String id;
	private String pw;
	private String name;
	
	
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public Member() {
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
	
	
	public String getInfo() {
		return this.id + "( " + this.name + " )";
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}
