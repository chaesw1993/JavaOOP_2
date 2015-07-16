package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 통장 Bean
 */

/*
	객체지향 프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
	그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야 한다.
	
	통장을 이루는 요소를 생각해보자.
	그 요소가 결국 인스턴수 변수를 구상하게 된다. (시스템 분석 설계를 생각하자)
	1. 은행이름(bank) 					=> 아이티뱅크
	2. 통장번호(bankBookNum)				=> 5자리의 랜덤숫자
	3. 소유자 이름(name)					=> 사용자가 스캐너로 입력한 이름 문자열
	4. 날짜 / 예금 / 출금 / 잔액(money)		=> 날짜를 제외한 사용자가 스캐너로 입력한 숫자타입
	5. 비밀번호(pass)						=> 사용자가 스캐너로 입력한 4자리 숫자
*/
/*
	[OUTPUT]
	===============
	[아이티뱅크]
	통장번호 : 12345
	이름 : 홍길동
	잔액 : 10000원
	===============
*/
public class BankBook {
	private String bank, name;
	private int bankBookNum, money;
	
	public void setBank(String bank) {
		Account account = new Account();
		this.bank = account.getBank();
	}
	public void setName(String name) {
		Account account = new Account();
		this.name = account.getName();
	}
	public void setBankBookNum(int bankBookNum) {
		Account account = new Account();
		this.bankBookNum = account.getBankBookNum();
	}
	public void setMoney(int money) {
		Account account = new Account();
		this.money = account.getMoney();
	}
	@Override
	public String toString() {
		return "===============\n"
				+ bank + "\n"
				+ "통장번호 : " + bankBookNum + "\n"
				+ "이름 : " + name + "\n"
				+ "잔액 : " + money + "원\n"
				+ "===============";
	}
}
