package dto;

public class StudentDTO {
	String sno;
	String name;
	int major;
	int score;
	static int mno;
	static String mname;
	public StudentDTO(String sno, String name, int major, int score, int mno, String mname) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
		this.mno = mno;
		this.mname = mname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public static String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", name=" + name + ", major=" + major + ", score=" + score + ", mno=" + mno
				+ ", mname=" + mname + "]";
	}

		
	
	}

	
	
	
