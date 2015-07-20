package inhebitance;
/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(핸드폰)의 객체클래스
 */
public class CelPhone extends Phone{
/*
	객체지향 프로그래밍 특징 => 상속
	extends라는 키워드로 부모역할을 하는 클래스(Phone)를 선언하면
	자식클래스(CelPhone)는 부모클래스의 자산(필드+메소드)를 따로 선언하지 않아도 사용할 수 있다.
*/	
	private boolean portable;	// 휴대 가능한지 여부
	private String move;		// 가지고 다니는 상황을 표시

	public boolean isPortable() {
		return portable;
	}
	
	// if-else로 참, 거짓을 판별하는 알고리즘을 구현하려면
	// 파라미터로 들어오는 값이 있어야 그 값에대한 판별을 할 것이다.
	// 이 상황에서는 setter에 구현한다.
	public void setPortable(boolean portable) {
		// boolean 타입의 getter는 is*() 방식으로 자동 생성된다.
		// 이경우엔 "반드시" 리턴타입의 지변을 선언하고 if-else 구문을 구현해야 한다.
		if (portable) {	// portable이 true 값이라면
			this.setMove("폰을 가지고 다닐수 있음");
		} else {
			this.setMove("폰을 가지고 다닐수 없음");
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
}
