package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 인터페이스인 Product를 구현(implements)한 클래스
 */ 
public class ProductSpec implements Product{	// 생성자, get/set을 안쓰고도 인터페이스를 구현함으로써 메소드를 사용
	private String company;	// 제조사
	private String name;	// 제품이름
	private String serialNo;// 시리얼넘버
	
	@Override
	public void showInfo() {
		System.out.println("제조사 : " + this.company);
		System.out.println("제품명 : " + this.name);
		System.out.println("시리얼넘버 : " + this.serialNo);
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		// 파랑 company는 멤변 , 감색 company는 파라미터의 지변
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
}
