package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 주사위 Bean
 */
public class Dice {
	/* ===== Field ===== */
	private int dice;
	
	/* ===== Constructor ===== */
	public Dice() {
		this.dice = (int) ((Math.random() * 6) + 1);
		// this.dice 는 (int) ((Math.random() * 6) + 1) 여기서 할당된 값을 Line 9 에있는 dice에 넣어라..******* 개중요함
	}
	
	/* ===== Member Method ===== */
	public int getDice() {
		return dice;
		// Line 9 의 dice를 return하라.
	}
}
