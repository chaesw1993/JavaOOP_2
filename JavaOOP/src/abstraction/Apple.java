package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 추상화와 다양성의 결합형태를 보는 예제
 */
public class Apple implements FruitsInterface{
	// 필드
	// 생성자
	// 멤버메소드
	@Override
	public void display(String str) {
		System.out.println(str + " 사과입니다.");
	}
}
