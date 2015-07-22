package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 스타벅스 시스템 인터페이스를 구현한 객체 클래스(추상클래스 학습)
 */ 
public class Coffee implements Recipe{
	private String coffee;
	
	@Override
	public void boilWater() {
		System.out.println("1. 물을 끓인다.");
	}

	@Override
	public void brew() {
		System.out.println("2. 커피를 내린다.");
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		System.out.println("4. 설탕 첨가 여부를 손님에게 묻는다.");
		if (option == 1) {
			this.coffee = "밀크";
		} else if(option == 2){
			this.coffee = "블랙";
		} else{
			System.out.println("숫자를 잘 못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	@Override
	public void serve() {
		System.out.println("5. 커피를 제공한다.");
		if (this.coffee==null) {
			System.out.println();
		} else {
			System.out.println("고객님 " + this.coffee + "커피가 나왔습니다.");
		}
	}
}
