package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 카드 두장을 비교하는 객체 예제(Bean) - 숫자 랜덤!
 */
public class CardBean2 {
	
	private String name, name2;	
	private int num, num2;
	
	public void setName(String name) {		
		this.name = name;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setNum() {
		// 외부(main)에서 받는 숫자가 없으므로 파라미터가 필요없다.
		this.num = (int) ((Math.random() * 13) + 1);
		// 1부터 13까지의 정수 중에서 랜덤 숫자를 리턴한다.
		// Math.random()*13 = 0~12의 13개의 숫자 / + 1 -> 1~13의 13개숫자
	}
	public void setNum2() {
		this.num2 = (int) ((Math.random() * 13) + 1);
	}
	public String getWinner() {
		String winner="";
		if(this.num > this.num2){
			winner = name + " 승리";
		} else if(this.num < this.num2){
			winner = name2 + " 승리";
		} else{
			winner = "비김";
		}
		return winner;
	}
	@Override
	public String toString() {
		String msg = "[" + name + " : " + num + "]" + " vs " + "[" + name2 + " : " + num2 + "]\n"
						+ this.getWinner();
		return msg;
	}
}
