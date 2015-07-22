package starbucks;

import java.util.Scanner;

/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 스타벅스 시스템의 예제 Main 클래스(추상클래스 학습)
 */ 
public class StarbucksMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 인터페이스를 구현한 클래스의 객체 생성문법
		// 인터페이스이름 객체 = new 생성자
		Recipe coffee = new Coffee();
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("설탕(밀크) 커피를 원하시면 1번, 무설탕(블랙)커피를 원하시면 2번을 눌러주세요.");
		coffee.select(scanner.nextInt());
		coffee.serve();
		System.out.println("===========================");
		Recipe tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("레몬티를 원하시면 3번, 자몽티를 원하시면 4번을 눌러주세요.");
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
