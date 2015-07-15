package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 카드 두장을 비교하는 객체 예제(Main)
 */
public class CardMain {
	/*
		[ORDER]
		-카드 두장을 비교해서 카드 번호가 더 큰수가 이기는 게임 프로그램을 작성하라.
		일단, 프로토타입(시제품) 프로그램으로
		개발자가 임의의 숫자를 입력하면
		[OUTPUT]
		
		[홍길동 : 7] vs [김유신 : 3]
		홍길동 승
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name="", name2="";
		int num=0, num2=0;
		
		System.out.print("이름1 : ");
		name = scanner.next();
		System.out.print("숫자1 : ");
		num = scanner.nextInt();
		System.out.print("이름2 : ");
		name2 = scanner.next();
		System.out.print("숫자2 : ");
		num2 = scanner.nextInt();
		
		CardBean cardBean = new CardBean();
		/*
			스캐너가 받아 놓은 값은 현재 지변에 있다.
			하지만 연산로직은 객체에 있다.
			**** 따라서 지변에 있는 값을 멤변에 던져야 한다.
				 setter를 이용
		*/
		cardBean.setName(name);
		cardBean.setNum(num);
		cardBean.setName2(name2);
		cardBean.setNum2(num2);
		
		System.out.println(cardBean.toString());

//		getter를 이용하여 출력할 경우.		
//		System.out.println("[" + cardBean.getName()+ " : " + cardBean.getNum() + "]" + " vs "
//							+ "[" + cardBean.getName2() + " : " + cardBean.getNum2() + "]\n"
//							+ cardBean.getWinner());
	}
}
