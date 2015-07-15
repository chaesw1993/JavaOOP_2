package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 카드 두장을 비교하는 객체 예제(Bean)
 */
public class CardBean {
	
	private String name, name2;	// 멤변 초기화 하지않음.	// winner라는 멤변은 쓸모가 없다. getter만 만들고 바로 삭제
														// 단지 계산만하면됨
	private int num, num2;		// 멤변은 private로 보안을 유지한다.
	
	public void setName(String name) {		// ()괄호 안에 값을 파라미터라고 하고 소속은 지변 // Main 에서 스캐너로 받아들인 녀석
		this.name = name;
		/*
			this.name은 인스턴스변수(멤변)이고
			= name 은 파라미터로 넘어온 지변(스캐너로 main에서 받은 값)
			스캐너가 받아 놓은 값을 가진 지변 값을 멤변 name에 할당하는 것.
			파라미터 값과 멤변 값의 이름은 달라도 상관없다.
			단, 데이터 타입은 같아야 한다.
		*/
	}
//	public String getName() {
//		return name;
//	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
//	public String getName2() {
//		return name2;
//	}
	public void setNum(int num) {
		this.num = num;
	}
//	public int getNum() {
//		return num;
//	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
//	public int getNum2() {
//		return num2;
//	}
	public String getWinner() {
		// getter 에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
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
