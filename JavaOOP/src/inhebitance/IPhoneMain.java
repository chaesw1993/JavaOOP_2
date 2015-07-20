package inhebitance;

import java.util.Scanner;

/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(아이폰)의 Main
 */
public class IPhoneMain {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		Scanner scanner = new Scanner(System.in);
		
		iPhone.setCompany(IPhone.BRAND);
		// 클래스명.필드명 ... get/set없이 사용하는 이유는
		// 은닉화가 필요없는 고정된 값이기 때문에 - IPhone.BRAND 식으로 사용해야 한다.
		iPhone.setPortable(IPhone.TRUE);		// 아이폰은 이동전화만 만든다.
												// static이 붙어있는녀석만 클래스.필드 / 고정된값만 이렇게 static
		
		System.out.println("연락 할 사람 : ");
		String name = scanner.next();
		iPhone.setCall(name);
		System.out.println("전달할 것 입력 : ");
		iPhone.setData(name, scanner.next());
		
		System.out.println(iPhone.getCompany() + "을 사용해서....");
		System.out.println(iPhone.getMove());
		System.out.println(iPhone.getCall());
		System.out.println(iPhone.getData());
	}
}
