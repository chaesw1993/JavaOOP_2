package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 계좌 Bean	--	Main이 없는 클래스는 전부 Bean으로 약속
 */

/*
	은행계좌
*/
public class Account {
	private String bank, name;
	private int bankBookNum, money, password;
	
	public Account() {}
	
	public Account(String bank, String name, int money, int password) {
		this.bank = bank;
		this.name = name;
		this.bankBookNum = (int) Math.random();
		this.password = password;
		this.money = money;
	}
	public String getBank() {
		return bank;
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
}
