package inhebitance;

import java.util.Scanner;

/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(핸드폰)의 Main
 */
public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone samsung = new CelPhone();
		samsung.setCompany("삼성 휴대전화");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람 : ");
		samsung.setCall(scanner.next());
		System.out.println(samsung.getCompany() + "를 사용해서....");
		samsung.setPortable(true);
		// boolean 타입의 set 메소드를 이용하여 setMove를 자동 설정하게끔 유도하고
		// 출력은 isPortable이 아니라 getMove를 호출하게 하는 패턴
		System.out.println(samsung.getMove());
		System.out.println(samsung.getCall());
	}
}
