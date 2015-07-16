package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : Chae S W
 * @ Story : 생성자 문법 -- 카드 게임 승리자를 나타내는 Main
 */
public class CardMain4 {
	public static void main(String[] args) {
		
		// 선언부 ==> 사용자가 자기 모니터에 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1 : ");
		CardBean3 hong = new CardBean3(scanner.next());
					// CardBean3(String ~~~) 생성자를 사용하여 name을 설정하고 num도 설정한다. (bean에 로직이 있음)
		System.out.print("이름2 : ");
		CardBean3 kim = new CardBean3(scanner.next());
		
		// 인터넷 망을 타고 데이터값이 게임회사에 들어옴
		// 그리고 밑의 클래스를 통해 연산을 함, **** 내용은 전부 **은닉화** 되어있다. ****
		
		CardGame game = new CardGame(hong, kim);
		
		// 사용자가 결과 화면을 봄
//		System.out.println(hong.getName() + " : " + hong.getNum());
//		System.out.println(kim.getName() + " : " + kim.getNum());
//		System.out.println(game.getWinner());
		System.out.println(game.toString());
	}
}
