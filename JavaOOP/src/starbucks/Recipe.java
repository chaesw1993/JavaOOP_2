package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 스타벅스 시스템의 예제 인터페이스(추상클래스 학습)
 */ 
public interface Recipe {
	/*
		커피 만드는 순서
		1. 물을 끓인다.
		2. 커피를 내린다.
		3. 물을 컵에 붓는다.
		4. 설탕 첨가 여부를 손님에게 묻는다.
			- 무설탕 : 블랙
			- 설탕 : 밀크
		5. 커피를 제공한다.
			- 고객님 [블랙/밀크] 커피가 나왔습니다.
	*/
	public abstract void boilWater();	
	// 인터페이스는 무조건 추상메소드가 와야하기 때문에 abstract가 생략되어도 있는것으로 간주한다.
	public void brew();
	public void pourInCup();
	public void select(int option);		// 선택을 받고 안받고에 차이가 있으므로 파라미터를 넣음.
	public void serve();
	/*
	차(tea) 만드는 순서
	1. 물을 끓인다.
	2. 티백을 내린다.
	3. 물을 컵에 붓는다.
	4. 레몬, 자몽 첨가 여부를 손님에게 묻는다.
		- 레몬 : 레몬티
		- 자몽 : 자몽티
	5. 차를 제공한다.
		- 고객님 [레몬/자몽] 티가 나왔습니다.
*/
}
