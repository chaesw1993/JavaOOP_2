package inhebitance;

import java.util.Scanner;

/*
 * @ Date : 2015.07.20
 * @ Author : Chae S W
 * @ Story : 눈으로 식별가능한 구상 클래스(안드로이드)의 Main
 */
public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("통화 상대 : ");
		String name = scanner.next();
		System.out.println("메세지 : ");
		String msg = scanner.next();
		
		androidPhone.setOs("");		
		// 사용자가 아무 액션도 하지 않고, 스캐너로 입력만 하면 OS는 android로 setting되게 만듬
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());
	}
}
