package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 인터페이스를 구현한 객체클래스를 출력하는 Main클래스  
 */ 
public class RobotMain {
	/*
		[OUTPUT]
		GunRobot : 속도는 10, 에너지는 10, 공격력은 50
		ShieldRobot : 속도는 20, 에너지는 20, 방어력은 50
	*/
	public static void main(String[] args) {
		RobotAttack gunRobot = new RobotAttack();
		gunRobot.charge(10);
		gunRobot.run(10);
		gunRobot.setAttackPoint(50);
		
		RobotShield shieldRobot = new RobotShield();
		shieldRobot.charge(20);
		shieldRobot.run(20);
		shieldRobot.setShieldPoint(50);
		
		Robot[] attack_shield = new Robot[2];
		attack_shield[0] = gunRobot;
		attack_shield[1] = shieldRobot;
		
		for(Robot robot : attack_shield){
			robot.status();
		}
	}
}
