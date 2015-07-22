package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 추상클래스 학습
 */ 
public class AngelCoffee extends DrinkRecipe{

	private String coffee;

	@Override
	void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	void select(int option) {
		System.out.println("설탕 첨가 여부를 손님에게 묻는다.");
		if (option == 1) {
			this.coffee = "밀크";
		} else if(option == 2){
			this.coffee = "블랙";
		} else{
			System.out.println("숫자를 잘 못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	@Override
	void serve() {
		System.out.println("커피를 제공한다.");
		if (this.coffee==null) {
			System.out.println();
		} else {
			System.out.println("고객님 " + this.coffee + "커피가 나왔습니다.");
		}
	}

}
