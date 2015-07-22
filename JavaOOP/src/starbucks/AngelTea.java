package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : Chae S W
 * @ Story : 추상클래스 학습
 */ 
public class AngelTea extends DrinkRecipe{
private String tea;

/*
	extends는 컨트롤 스페이스로 @Override를 호출하라고했는데
	그것은 extends 클래스가 일반 클래스인 경우이고
	추상클래스는 일반클래스 + 인터페이스 형태이므로
	인터페이스의 특징을 갖게된다.
	따라서 extends 이지만 부모클래스가 추상클래스라면
	unimplements를 해줘야한다.
*/
	@Override
	void brew() {
		System.out.println("티백을 내린다.");
	}

	@Override
	void select(int option) {
		System.out.println("레몬/자몽 첨가 여부를 손님에게 묻는다.");
		if (option == 3) {
			this.tea = "레몬";
		} else if(option == 4){
			this.tea = "자몽";
		} else{
			System.out.println("숫자를 잘 못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	@Override
	void serve() {
		System.out.println("차를 제공한다.");
		if (this.tea==null) {
			System.out.println();
		} else {
			System.out.println("고객님 " + this.tea + "티가 나왔습니다.");
		}
	}

}
