package member.domain;

public class Member {

	private int idx;
	private String uid;
	private String uname;
	private String uphoto;
	
	
	public Member() {}
	
	public Member(int idx, String uid, String uname, String uphoto) {
		this.idx = idx;
		this.uid = uid;
		this.uname = uname;
		this.uphoto = uphoto;
	}

	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	
	@Override
	public String toString() {
		return "Member [idx=" + idx + ", uid=" + uid + ", uname=" + uname + ", uphoto=" + uphoto + "]";
	}
	
}
