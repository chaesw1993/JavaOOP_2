package encapsulation;

import java.util.Scanner;
/*
 * @ Date : 2015.07.14
 * @ Author : Chae S W
 * @ Story : 카우푸지수 Main
 */
public class KaupMain {
	public static void main(String[] args) {
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx =0; // 카우푸 인덱스
		Scanner scanner = new Scanner(System.in);
		// 연산부
		System.out.println("이름 입력 :");
		name = scanner.next();
		System.out.println("몸무게 입력 :");
		weight = scanner.nextInt();
		System.out.println("키 입력 :");
		height = scanner.nextInt();
		
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex();
		// 출력부
		System.out.println(kaupBean.toString());
	}
}