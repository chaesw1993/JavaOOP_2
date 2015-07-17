package encapsulation;

import java.util.Scanner;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 계좌 Main
 */
public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
			생성자가 가지는 기능
			1. 객체를 만드는 기능
			2. setter 기능
			3. 객체가 만들어지는데 필수적인 요소가 주어지지 않으면 아예 생성을 막는 기능 => 제약을 건다, 방어코딩
		*/
		System.out.print("고객이름 : ");
		BankBook bankBook = new BankBook(scanner.next());
		System.out.print("예금금액 : ");
		bankBook.deposit(scanner.nextInt());
		System.out.print("출금금액 : ");
		bankBook.withdraw(scanner.nextInt());
		System.out.print("예금금액 : ");
		bankBook.deposit(scanner.nextInt());
		System.out.println(bankBook.toString());
	}
}
