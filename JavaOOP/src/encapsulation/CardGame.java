package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 생성자 문법 -- 카드 게임 승리자를 나타내는 클래스
 */
public class CardGame {
	// 생성자 단축키
	// CTRL + SPACE
	
		/* ===== Field ===== */
	
	private String winner;		// 멤변 선언
	
		/* ===== Constructor ===== */
	
	public CardGame() {}
	// String이나 int같은 기본타입이 아닌 사용자가 직접 만든 클래스 객체의 기본형은 'null'

	public CardGame(CardBean3 bean1, CardBean3 bean2) {		// 생성자에는 리턴타입이 없다.
		String winner="";
		if(bean1.getNum() > bean2.getNum()){
			winner = bean1.getName() + " 승리";
		} else if(bean1.getNum() < bean2.getNum()){
			winner = bean2.getName() + " 승리";
		} else{
			winner = "비김";
		}
		this.winner = winner;
	}
	public String getWinner() {
		return winner;
	}
}
