package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 추상적인 로봇이라는 개념을 인터페이스로 만듦  
 */ 
public interface Robot {
	/*
		로봇의 에너지
	*/
	public void charge(int energy);
	/*
		로봇이 뛰는 기능
	*/
	public void run(int speed);
	/*
		로봇의 상태 모니터링
	*/
	public void status();
}
