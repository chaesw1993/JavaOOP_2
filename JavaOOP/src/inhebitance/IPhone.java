package inhebitance;
/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(아이폰)의 객체클래스
 */
public class IPhone extends CelPhone{
	private String data;
	private String os;
	public static boolean TRUE = true;	// 오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰";
	// 브랜드를 static 이라는 키워드를 사용해서 클래스변수로 만들고 고정값으로 설정함.
	// static은 [get/set을 만들지 마라 / 생성자를 만들지마라] 라는 뜻이다. 값 고정
	public String getData() {
		return data;
	}
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = "iOS";
	}

	public void setData(String name, String data) {// get/set에서 파라미터 추가하는 정도의 변화는 개발자 재량.
		this.data = name + " 에게 " + data + " 을(를) 전달하였습니다.";
	}
	
}
