package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 인터페이스를 구현한 객체클래스를 상속한 객체 클래스  
 */ 
public class RobotAttack extends BasicBot{
	private int attackPoint;
	
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.print("GunRobot : ");
		super.status();
		System.out.println(", 공격력은 " + this.attackPoint);
	}
}
