package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 추상화와 다양성의 결합형태를 보는 예제
 */
public class Banana implements FruitsInterface{

	@Override
	public void display(String str) {
		System.out.println(str + " 바나나 입니다.");
	}
}
