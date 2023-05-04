package member.domain;

public class MemberDTO {

	private int idx;
	private String uid;
	private String uname;
	private String uphoto;
	
	
	public MemberDTO() {}
	
	public MemberDTO(int idx, String uid, String uname, String uphoto) {
		super();
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
		return "MemberDTO [idx=" + idx + ", uid=" + uid + ", uname=" + uname + ", uphoto=" + uphoto + "]";
	}
	
}
