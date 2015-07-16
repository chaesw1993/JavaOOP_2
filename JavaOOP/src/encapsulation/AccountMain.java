package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 계좌 Main
 */
public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String bank="", name="";
		int money=0, password=0;
		System.out.print("은행이름 : ");
		bank = scanner.next();
		System.out.print("고객이름 : ");
		name = scanner.next();
		System.out.print("예금금액 : ");
		money = scanner.nextInt();
		System.out.println("비밀번호설정 : ");
		password = scanner.nextInt();
		
		Account account = new Account(bank, name, money, password);
		BankBook bankBook = new BankBook();
		System.out.println(bankBook.toString());
	}
}
