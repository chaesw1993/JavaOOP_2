package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 관리자입장에서 계좌 관리하는 인터페이스
 */
public interface BankRole {
	
	// 계좌 개설 기능
	public void openAccount(String ownerName, int pass, int restMoney);
	
	// 계좌번호를 입력하면 계좌 내용이 출력되는 기능
	public BankBook searchAccountByAccountNo(String accountNo);
	
	// 계좌주 이름을 입력하면 그 사람 소유의 계좌가 전부 검색 (동일인이 다수의 계좌를 가질 수 있음)
	public BankBook[] searchAccountByName(String ownerName);
	
	// 계좌주 이름을 입력하면 그 사람 소유의 계좌 갯수를 알려주는 기능
	public int searchCountByName(String name);
	
	// 계좌번호로 특정 계좌를 폐기하는 기능
	public boolean closeAccount(String accountNo);
}
