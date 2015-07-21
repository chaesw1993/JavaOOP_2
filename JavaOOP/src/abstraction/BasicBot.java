package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 인터페이스인 Robot를 구현(implements)한 클래스  
 */ 
public class BasicBot implements Robot{
	private int energy;
	private int speed;
	
	@Override
	public void charge(int energy) {
		this.energy += energy;
	}

	@Override
	public void run(int speed) {
		this.speed += speed;
	}

	@Override
	public void status() {
		System.out.print("로봇 속도는 " + this.speed);
		System.out.print(", 로봇 에너지는 " + this.energy);
	}

}
