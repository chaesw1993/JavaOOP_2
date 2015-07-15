package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 생성자 문법 -- 카드 두장을 비교하는 객체 예제(Main)
 */
public class CardMain3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name="", name2="";
		int num=0, num2=0;
		
		System.out.print("이름1 : ");
		name = scanner.next();
		System.out.print("이름2 : ");
		name2 = scanner.next();
		
		CardBean3 hong = new CardBean3(name);
							// CardBean3(String ~~~) 생성자를 사용하여 name을 설정하고 num도 설정한다. (bean에 로직이 있음)
		CardBean3 kim = new CardBean3(name2);
		
		System.out.println(hong.getName() + " : " + hong.getNum());
		System.out.println(kim.getName() + " : " + kim.getNum());
	}
}
