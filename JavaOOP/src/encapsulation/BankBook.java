package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 통장 Bean
 */

import abstraction.Account;

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
	인터페이스
	1. withdraw(int money) : void
	2. deposit(int money) : void
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
public class BankBook implements Account{	// interface에 있는것을 "무조건" 만들어라
	
	// 상수 : final 을 붙여서 절대 불변의 값을 만듦 // 위치 : 필드 --> {인변,상수,클래스변수} < 멤변
	// 스태택 : final을 빼버리면 절대 불변의 값이 아니라 바꿀수있지만, 고정된 값 스태틱 값이 된다.
	//		   스태틱 = 클래스 변수
	// BankBook b = new BankBook();
	// b.bank() --> 인변이 값을 호출하는 상태
	// BankBook.bank() --> 클래스변수가 값을 호출하는 상태
	
/* ===== 필드 ===== */
	public static String BANK;
	// 변수는 변수인데 클래스로 호출되는놈
	private String name;
	private int bankBookNum, money;
	private int pass;
	private String msg;		// 유효성 체크 결과를 알려줘서 고객이 만약 이상한 숫자를 입력할경우 공지해주는 메세지

/* ===== 생성자 ===== */
	public BankBook(String name) {		// 괄호 안의 파라미터 = 사용자의 입력값
		this.BANK="[아이티뱅크]";
		// 계좌번호는 5자리 숫자
		this.bankBookNum = (int) (Math.random()*99999)+10000;	// (Math.random()*[END])+[START]
		this.name = name;
	}
	/* 
	 개발자는 setter를 쓸지, 생성자로 끝낼지 고민
	 BANK = 은행 바뀌면 안됨. name = 이름도 바뀌면 안됨, 비밀번호, 계좌번호도 바뀌면 안됨. 바뀔수있는건 예금,출금을 해야하는 money뿐
	 getter setter 단축키 : ALT + SHIFT + S + R
	 상수, static은 getter setter를 만들지 않는다.
	*/ 
	
	
/* ===== 멤버 메소드 ===== */	
	@Override
	public String toString() {
		return "===============\n"
				+ BANK + "\n"
				+ "통장번호 : " + bankBookNum + "\n"
				+ "이름 : " + name + "\n"
				+ "잔액 : " + money + "원\n"
				+ "===============";
	}
	
	// getter와 setter는 만들지 안만들지 상식선에서 생각해야한다.
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
		// 파라미터 값이 정상값이 아닌 상태를 추적해서 필터링 하는 로직이 필요해짐. ==> 유효성 체크
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다. 다시 입력해주세요.";
		} else if(this.money < money){
			msg = "잔액이 부족합니다.";
		} else {
			this.money -= money;	// 누적된 money값에서 입력받은 money값을 뺀다.
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
