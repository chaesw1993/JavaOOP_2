package bank;

import java.util.Scanner;

/*
 * @ Date : 2015.07.23
 * @ Author : Chae S W
 * @ Story : BankMain 클래스
 */
public class KBbankMain {
	public static void main(String[] args) {
		BankRole bank = new Bank(100);
		// 인터페이스를 구현한 클래스를 가지고 올때 => 인터페이스 + 객체 = new 생성자
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름 : ");
		String ownerName = scanner.next();
		System.out.println("비밀번호 입력 : ");
		int pass = scanner.nextInt();
		System.out.println("입금 금액 : ");
		int restMoney = scanner.nextInt();
		bank.openAccount(ownerName, pass, restMoney);
		
		System.out.println("==== 계좌번호 조회(계좌번호) ====");
		System.out.println("검색하려는 고객명 : ");
		String searchName = scanner.next();
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount]; 
		searchArr = bank.searchAccountByName(searchName);
		for (BankBook bankBook : searchArr) {
			bankBook.showAccount();
		}
		System.out.println("검색하려는 계좌번호 : ");
		bank.searchAccountByAccountNo(scanner.next()).showAccount();
	}
}
