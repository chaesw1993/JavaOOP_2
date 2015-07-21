package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 인터페이스를 구현한 객체클래스를 상속한 객체 클래스  
 */ 
public class RobotShield extends BasicBot{
	private int shieldPoint;
	
	public void setShieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	@Override
	public void status() {
		System.out.print("ShieldRobot : ");
		super.status();
		System.out.println(", 방어력은 " + this.shieldPoint);
	}
}