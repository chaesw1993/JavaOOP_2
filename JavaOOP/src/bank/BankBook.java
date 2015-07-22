package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 사용자입장에서 계좌 관리하는 인터페이스의 구현클래스
 */ 
public class BankBook implements Account{
	public static String BANK;
	private String name;
	private int bankBookNum, money;
	private int pass;
	private String msg;		// 유효성 체크 결과를 알려줘서 고객이 만약 이상한 숫자를 입력할경우 공지해주는 메세지

	public BankBook(String name) {		
		this.BANK="[아이티뱅크]";
		this.bankBookNum = (int) (Math.random()*99999)+10000;	// (Math.random()*[END])+[START]
		this.name = name;
	}
	@Override
	public String toString() {
		return "===============\n"
				+ BANK + "\n"
				+ "통장번호 : " + bankBookNum + "\n"
				+ "이름 : " + name + "\n"
				+ "잔액 : " + money + "원\n"
				+ "===============";
	}
	
	public String getName() {
		return name;
	}
	public int getBankBookNum() {
		return bankBookNum;
	}
	public int getMoney() {
		return money;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}

	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다. 다시 입력해주세요.";
		} else if(this.money < money){
			msg = "잔액이 부족합니다.";
		} else {
			this.money -= money;	
		}
	}
	@Override
	public void deposit(int money) {
		if (money <= 0) {
			msg = "입금액은 0보다 커야 합니다. 다시 입력해주세요.";
		} else {
			this.money += money;
		}
	}
}
