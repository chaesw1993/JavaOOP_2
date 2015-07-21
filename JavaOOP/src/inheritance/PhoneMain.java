package inheritance;

import java.util.Scanner;

/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(전화기)의 Main
 */
public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		// 인스턴스(객체) 생성 이유는 ? 메소드 호출
		phone.setCompany("삼성 가정용 전화기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람 : ");
		phone.setCall(scanner.next());
		System.out.println(phone.getCompany() + "를 사용해서....");
		System.out.println(phone.getCall());
	}
}
