package bank;

import java.util.Scanner;

/*
 * @ Date : 2015.07.23
 * @ Author : Chae S W
 * @ Story : BankMain 클래스
 */
public class HanaBank {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		Scanner scanner = new Scanner(System.in);
		int input = 0, key = 0;
		while (true) {
			System.out.println("1. 계좌개설 2. 계좌조회(번호) 3. 계좌조회(이름) 4. 전체계좌 5. 계좌폐기 0. 종료");
			input = scanner.nextInt();
			// 무조건 메소드를 호출하면 이클립스가 자동으로 메소드를 만들어주는 create method 메뉴가 나타남
			key = inputCheck(input,0,5);
			if (input != 0) {
				switch (key) {
				case 1:
					System.out.println("고객 이름 : ");
					String ownerName = scanner.next();
					System.out.println("비밀번호 입력 : ");
					int pass = scanner.nextInt();
					System.out.println("입금 금액 : ");
					int restMoney = scanner.nextInt();
					bank.openAccount(ownerName, pass, restMoney);
					break;
				case 2:
					System.out.println("검색하려는 계좌번호 : ");
					BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
					System.out.println(bankBook.showAccount());
					break;
				case 3:		// 안됨
					System.out.println("검색하려는 고객명 : ");
					String searchName = scanner.next();
					int searchCount = bank.searchCountByName(searchName);
					
					BankBook[] searchArr = new BankBook[searchCount]; 
					searchArr = bank.searchAccountByName(searchName);
					
					for (BankBook bankBooks : searchArr) {
						bankBooks.showAccount();
					}
					break;
				case 4: 
					System.out.println("전체계좌 조회");
					BankBook[] list = bank.getBankBookList();
					if (bank.getCount() != 0) {
						for (int i = 0; i < bank.getCount(); i++) {
							System.out.println(list[i].showAccount());
						}
					} else {
						System.out.println("은행에 계좌가 없습니다.");
					}
					break;
				case 5:
					System.out.println("삭제하려는 계좌번호 : ");
					String deleteAccount = String.valueOf(scanner.next());
					boolean closeOk = bank.closeAccount(deleteAccount);
					if(closeOk==true){
						System.out.println("삭제되었습니다.");
					} else{
						System.out.println("해당계좌가 없습니다.");
					}
					break;
				case 0: 
					
					break;

				default: 
					System.out.println("에러발생");
					break;
				}
			} else {
				System.out.println("시스템 종료");
				break;	// 무한루프로직에서 시스템 종료요청시 조건에 합당하면 break 처리로 나감
						// switch-case 에서도 동일하게 사용 
			}
		}
	}

	private static int inputCheck(int input, int i, int j) {
		if (input < i || input > j) {
			System.out.println("숫자를 잘 못 입력하였습니다.");
			return 0;
		} else {
			return input;
		}
	}
}
