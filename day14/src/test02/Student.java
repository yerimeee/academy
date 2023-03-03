package test02;
// getter, setter 변수만 있는 api를 "자바 빈" 이라고 말함 + 생성자 추가 + toString(오버라이딩)
public class Student {
	private String stuNo;
	private String name;
	private int score;	//자료형이 일정하지 않아서 배열 못 만듦-> 객체 만들어 객체를 배열로 넣음
	private String address;
	private String tel;
	private boolean attending; //재학중인지 아닌지
	
	//생성자 넣기!
	Student() {
		//메인에서 객체 생성시에 아무것도 안 넣을 수도 있어서 빈칸
	}
	
	//메인에서 객체 생성시에 모든 필드를 다 넣을 수도 있으니 source - constructor using Field로 체크하고 넣어줌
	public Student(String stuNo, String name, int score, String address, String tel, boolean attending) {
		//super(); 안 불러도 됨. 매개변수를 부모 클래스로 넘겨주지 않아도 되기 때문에 없어도 됨(상속이 없으니까)
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
		this.address = address;
		this.tel = tel;
		this.attending = attending;
	}
	
	//private형이라 가져올 수 없어서 source에서 get,set 설정으로 변수명 넣고 호출함
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isAttending() {
		return attending;
	}
	public void setAttending(boolean attending) {
		this.attending = attending;
	}
	
	//// toString 오버라이딩 source - Generate to String해서 보통 필드값만 체크해서 넣어주면 됨 
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", score=" + score + ", address=" + address + ", tel="
				+ tel + ", attending=" + attending + "]";
	}
}
