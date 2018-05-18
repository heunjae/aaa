package JDBC2;

public class Member {
	private String name;
	private int age;
	private String tel;
	private String memNum;
	
	public Member(String name, int age, String tel, String memNum) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.memNum = memNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMemNum() {
		return memNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	
	
}
