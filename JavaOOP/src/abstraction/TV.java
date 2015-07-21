package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : ProductSpec을 상속한 TV 객체 클래스
 */ 
public class TV extends ProductSpec{
	// 주어진 것만 하라고 했으면 ProductSpec에서 마무리가 되었을것.
	// 시키는것만 하겠다 = 인터페이스 implements
	// 추가할게 있다 = 클래스 extends
	// 시키는것을 하긴 하되 추가할게 있다 = 인터페이스 implements한 클래스를 extends
	
	private String screenSize;
	private String screenType;
	
	public void writeInfo(String company, String name, String serialNo, String screenSize, String screenType) {
		// super.company 가 오류뜨는이유 -- "부모클래스에서 private로 선언되어있기때문"
		
		super.writeInfo(company, name, serialNo);
		// 부모에게 선언된 "public 메소드"에 접근, 사용가능
		this.screenSize = screenSize;
		this.screenType = screenType;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린 사이즈 : " + this.screenSize);
		System.out.println("스크린 타입 : " + this.screenType);
	}
}
