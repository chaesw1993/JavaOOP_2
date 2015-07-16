package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : Chae S W
 * @ Story : 부루마블 Bean
 */
public class Blue {
	/* ===== Field ===== */
	// 주사위 두개 값
	private int sum;
	
	/* ===== Constructor ===== */
	// 생성자 파라미터 2개(주사위)
	public Blue(Dice dice1, Dice dice2) {
		this.sum = dice1.getDice() + dice2.getDice();
	}
	
	/* ===== Member Method ===== */
	@Override
	public String toString() {
		return "두 주사위의 합이 " + this.sum + "입니다. " + this.sum + "칸 전진하세요.";
	}
}
