package abstraction;
/*
 * @ Date : 2015.07.17
 * @ Author : Chae S W
 * @ Story : 인터페이스를 통한 추상화 구현
 */
public interface Account {
	/*
		추상메소드(abstract method) : {} body 가 없는 메소드 
								<-> 구상메소드(concrete method) : {} body를 갖춘 메소드 (내용을 갖춘)
		추상 메소드를 왜 만드는가?
			-action으로 이뤄진 개념들은 개발자에 따라, 혹은 해석하는 사람에 따라 달라지므로
			 아웃라인(메소드이름, 파라미터 타입, 갯수)을 정해서 인터페이스에 있는 기능은 반드시 구현하라는
			 암묵의 지시사항이다. => 프로그래머에 제약을 건다.		
	*/
	public void withdraw(int money);
	public void deposit(int money);
}
