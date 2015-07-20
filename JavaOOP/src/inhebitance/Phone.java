package inhebitance;
/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(전화기)의 객체클래스
 */
public class Phone {
/* === 필드 === */
	private String company;
	private String call;
/* === 생성자 === */
	
/* === 멤버메소드 === */
	// getter/setter 단축키 = 알트 쉬프트 S
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
}
