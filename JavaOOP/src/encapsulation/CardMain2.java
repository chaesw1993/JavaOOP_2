package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 카드 두장을 비교하는 객체 예제(Main) - 숫자 랜덤!
 */
public class CardMain2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name="", name2="";
		int num=0, num2=0;
		
		System.out.print("이름1 : ");
		name = scanner.next();
		System.out.print("이름2 : ");
		name2 = scanner.next();
		
		CardBean2 cardBean2 = new CardBean2();
		cardBean2.setName(name);
		cardBean2.setNum();		// 스캐너로 받지는 않지만 setNum() 메소드를 사용하지 않으면 메소드가 실행되지 않는다.
		cardBean2.setName2(name2);
		cardBean2.setNum2();
		
		System.out.println(cardBean2.toString());
	}
}
