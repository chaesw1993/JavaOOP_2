package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 관리자입장에서 계좌 관리하는 인터페이스를 구현한 클래스
 */
public class Bank implements BankRole{
	// 필드
	
	// 생성자
	public Bank() {}
	
	// 멤버메소드(인터페이스를 구현했으면 만들필요가 없음)
		
	@Override	// 계좌 개설
	public void openAccount(String accountNo, String ownerName, String pass, int restMoney) {
		
	}
	
	@Override	// 계좌 검색(계좌 번호) -> 리턴결과 : 계좌 1개
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}

	@Override	// 계좌 검색(이름) -> 리턴결과 : 계좌 복수개
	
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}

	@Override	// 계좌 검색(이름) -> 리턴결과 : 숫자
	public int searchCountByName(String name) {
		int count=0;
		return count;
	}

	@Override	// 계좌 폐기
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
