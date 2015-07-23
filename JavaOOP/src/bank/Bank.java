package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 관리자입장에서 계좌 관리하는 인터페이스를 구현한 클래스
 */
public class Bank implements BankRole{
	// 필드
	private String ownerName;
	
	// 아래 배열은 은행에서 보면 계좌를 관리하는 DB
	private BankBook[] bankBookList;	// 은행은 통장을 여러개 관리한다. 따라서 필드에 인스턴스 변수 하나를 지정하지 않고
										// 여러개를 담을 수 있는 배열을 지정한다.
	private int count;		// 은행에서 관리하는 통장 개수

	// 생성자
	// 배열, 자료구조(컬렉션) 을 보유하는 객체를 만들고자 할때는 그 객체의 생성자에 배열, 자료구조의 객체를 생성 해준다.
	public Bank(int count) {
		bankBookList = new BankBook[count];
	}
	
	// 멤버메소드(인터페이스를 구현했으면 만들필요가 없음)
	public String getOwnerName() {
		return ownerName;
	}

	public BankBook[] getBankBookList() {
		return bankBookList;
	}

	public int getCount() {
		return count;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override	// 계좌 개설
	/*
		계좌번호, 계좌주, 비번, 잔액만 입력하면 통장을 만들어준다는 은행의 규칙
	*/
	public void openAccount(String ownerName, int pass, int restMoney) {
		BankBook bankBook = new BankBook(ownerName);
		bankBook.setPass(pass);
		bankBook.deposit(restMoney);
		// 통장을 개설하자마자 은행 전산 DB에 통장정보 저장의 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++;	// 전체 은행에 개설된 통장 개수 1 증가
		System.out.println(bankBook.showAccount());
	}

	@Override	// 계좌 검색(계좌 번호) -> 리턴결과 : 계좌 1개
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;
		// String -> int
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankBookNum()==searchAccountNo) {
				// 문자타입(String) 서로 같은지 여부 => .equals()
				// 숫자타입(int) 서로 같은지 여부 => ==
				account = bankBookList[i]; 
			}
		}
		return account;
	}

	@Override	// 계좌 검색(이름) -> 리턴결과 : 계좌 복수개
	public BankBook[] searchAccountByName(String ownerName) {
		// [서치 어카운트 바이 네임] 이 메소드를 호출하면 자동으로 [서치 카운트 바이 네임]을 먼저 실행 및 호출한다
		BankBook[] accounts = null;
		int tempCount = this.searchCountByName(ownerName);
		if (tempCount == 0) {	// 조회한 사람의 통장의 count가 0이라면
			return null;
		} 
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[count] = bankBookList[i];
				tempCount++;
			}
		}
		return accounts;
	}

	@Override	// 계좌 검색(이름) -> 리턴결과 : 숫자
	public int searchCountByName(String name) {
		int count=0;

		// for문을 돌면서 파라미터로 받은 이름과 동일한 계좌가 있다면 지변 count를 증가연산자를 통해 증가시켜라
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	@Override	// 계좌 폐기
	public boolean closeAccount(String accountNo) {
		// flag 은 삭제가 성공적으로 이뤄지면 true를 리턴하고, 삭제할게 없다면 false를 리턴한다.
		boolean flag = false;
		// 파라미터로 들어온 String문자열을 int형으로 바꿔서 비교하는 것.
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankBookNum() == searchAccountNo) {
				flag = true;
				/*
					j = i 로 바꾼 이유는
					홍길동의 계좌가 은행 전체계좌의 50번째라면 내부 for문에서 다시 처음 0 부터 회전하지 않고
					홍길동의 계좌가 있는 인덱스 번호부터 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한 후
					맨 마지막 인덱스 번호를 제거하면 은행에서 전체 계좌가 100개 였었다면 
					홍길동 계좌가 삭제된 후 전체 계좌는 99개가 될 것이다.
					그래서 this.count를 -1해준것이다.
					==
					** 삭제알고리즘은 매우 중요하다 **
				*/
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count--;
			}
		}
		return flag;
	}
}
