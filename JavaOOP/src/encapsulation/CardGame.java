package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 생성자 문법 -- 카드 게임 승리자를 나타내는 클래스
 */
/*
	현재는 홍길동 승리 라고만 나오는데
	홍길동 : 5
	김유신 : 1
	홍길동 승리 이렇게 나오게 업그레이드
*/
public class CardGame {
	// 생성자 단축키
	// CTRL + SPACE
	
		/* ===== Field ===== */
	
	private String winner, loser;		// 멤변 선언
	private int winScore, loseScore;
		
		/* ===== Constructor ===== */
	
	public CardGame() {}
	// String이나 int같은 기본타입이 아닌 사용자가 직접 만든 클래스 객체의 기본형은 'null'

	public CardGame(CardBean3 bean1, CardBean3 bean2) {		// 생성자에는 리턴타입이 없다.
		String winner="", loser="", draw="";
		int winScore=0, loseScore=0;
		// 지역변수(로컬변수)는 메모리 영역중에서 (콜)스택에 저장
		// 인스턴스변수(멤버변수)는 메모리 영역중에서 힙에 저장
		if(bean1.getNum() > bean2.getNum()){
			winner = bean1.getName();
			loser = bean2.getName();
			winScore = bean1.getNum();
			loseScore = bean2.getNum();
		} else if(bean1.getNum() < bean2.getNum()){
			winner = bean2.getName();
			loser = bean1.getName();
			winScore = bean2.getNum();
			loseScore = bean1.getNum();
		} else{
			winner = "비김";
		}
		this.winner = winner;
		this.loser = loser;
		this.winScore = winScore;
		this.loseScore = loseScore;
	}
		
		/* ===== Member Method ===== */
	@Override
	public String toString() {
		String msg = "=============\n" 
					+ this.winner + " : " + this.winScore + "\n" 
					+ this.loser+ " : " + this.loseScore + "\n"
					+ this.winner + " 승리\n"
					+ "=============";
		return msg;
	}
}
