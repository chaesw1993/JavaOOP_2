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
		// 배열은 배열의 크기가 필요하기때문에 생성자를 사용하여 배열의 크기를 정해준 후에
		// 그 배열의 객체에 값을 할당하는 이런식의 공식이 있다.
		
		for (BankBook bankBook : searchArr) {
			bankBook.showAccount();
		}
		System.out.println("검색하려는 계좌번호 : ");
		// 객체가 메소드를 호출한 후 연산을 통해 결과를 리턴하였지만 그 리턴값을 받는 변수처리는 개발자가 별도로 해줘야 함
		// 그 방법은 메소드가 리턴하는 리턴타입을 알아내서 그 타입으로 변수하나를 만든 다음 그 변수에 리턴값을 할당한다.
		BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
		System.out.println(bankBook.showAccount());
		
		System.out.println("삭제하려는 계좌번호 : ");
		String delete = scanner.next();
		// int 와 String 의 값을 서로 비교하려면 String 타입을 int로 바꿔줘야 한다.
		// int one = String valueOf("12345"); 의 결과값은 12345
		String deleteAccount = String.valueOf(delete);
		boolean closeOk = bank.closeAccount(deleteAccount);
		if(closeOk==true){
			System.out.println("삭제되었습니다.");
		} else{
			System.out.println("해당계좌가 없습니다.");
		}
	}
}
