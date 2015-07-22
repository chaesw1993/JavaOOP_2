package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 사용자입장에서 계좌 관리하는 기능 인터페이스
 */ 
public interface Account {
	public void deposit(int money);		// 예금
	public void withdraw(int money);	// 출금
	
}
