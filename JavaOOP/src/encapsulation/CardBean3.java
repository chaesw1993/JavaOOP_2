package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 생성자 문법 -- 카드 두장을 비교하는 객체 예제(Bean)
 */
public class CardBean3 {
	/*
		생성자는 setter를 통해 값을 할당하는 기능을 보강하여, 
		객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 *=== 메소드 ===* 이다.
	*/
	
	
		
			/* ===== Field ===== */
	
	private String name, name2;	
	private int num, num2;
	
			/* ===== Constructor ===== */	// 생성자 위치는 (멤버)필드와 메소드영역 사이에 위치 / 생성자 모양 = pulic 클래스이름(){}
	
	public CardBean3(){} // 디폴트 생성자
	// 디폴트 생성자는 개발자가 직접 만들지 않아도 프로그램 내부에서는 생성돼있는 것으로 인식한다.
	// 그런데 이것을 꺼내든 이유는 new 키워드를 통한 객체생성 역할뿐 아니라 생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서...
	// setter가 막 100개넘어가면 한개씩 다 쓸수없다. 그러므로 생성자를 사용한다.
	
	public CardBean3(String name) {
		// setter역할을 같이 하는 생성자
		this.name = name;
		this.num = (int) ((Math.random() * 13) + 1);
	}
	
			/* ===== Method ===== */

	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
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
