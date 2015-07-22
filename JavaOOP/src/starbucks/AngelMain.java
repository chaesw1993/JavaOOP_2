package starbucks;

import java.util.Scanner;

/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 추상클래스 학습
 */ 
public class AngelMain{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AngelCoffee kim = new AngelCoffee();
		
		System.out.println("설탕(밀크) 커피를 원하시면 1번, 무설탕(블랙)커피를 원하시면 2번을 눌러주세요.");
		kim.prepare(scanner.nextInt());
		System.out.println("======================");
		AngelTea lee = new AngelTea();
		System.out.println("레몬티를 원하시면 3번, 자몽티를 원하시면 4번을 눌러주세요.");
		lee.prepare(scanner.nextInt());
	}
}
