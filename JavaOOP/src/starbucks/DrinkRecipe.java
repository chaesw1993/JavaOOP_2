package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 추상클래스 학습
 */ 
public abstract class DrinkRecipe {
/*
	추상클래스
	- 추상 메소드를 가지고 있는 것은 인터페이스와 동일하나,
	  구상 메소드({}바디를 가지고 있는 것)도 추가로 가질 수 있고
	  객체 생성시 개발자 마음대로 메소드를 추가하여도 문제가 없다.
	  인터페이스와 일반 클래스의 짬뽕 
*/
	public void prepare(int option){
		boilWater();
		brew();
		pourInCup();
		select(option);
		serve();
	}
	
	private void boilWater(){
		System.out.println("물을 끓인다.");
	}
	abstract void brew();	
	// 추상 메소드는 private는 허용되지 않는다.
	// 외부에서 접근 금지를 하려면 디폴트 상태로 둔다.
	private void pourInCup(){
		System.out.println("물을 붓는다.");
	}
	abstract void select(int option);		// 선택을 받고 안받고에 차이가 있으므로 파라미터를 넣음.
	abstract void serve();
}
