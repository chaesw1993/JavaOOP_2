package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 클래스 상속, 인터페이스 구현을 한 객체클래스를 실행하는 Main클래스  
 */ 
public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.writeInfo("삼성", "와이드TV", "123123", "55인치", "슈퍼아몰레드");
		Notebook gram = new Notebook();
		gram.writeInfo("헬쥐", "그램", "456456", "i7", "8GB", "500GB");
		/*
			생성자를 사용하지 않는 인터페이스라도 타입으로 사용하기 위해
			배열을 선언하는 것은 가능하다.
		*/
		Product[] cart = new Product[2];
		 /*
		 	인터페이스를 사용하는 이유 두번째.
		 	타입으로 통합을 해야하는 클래스들의 집합이 필요한 상황에서
		 	각각의 클래스를 하나의 컬렉션에 담는 역할을 한다.
		 */
		cart[0] = samsungTV;
		cart[1] = gram;
		// 배열을 출력할때는 무조건 for-loop인데
		// 카트 내부에 있는 객체를 선언해야 할 필요가 존재한다. 이 상황에선 확장 for문을 사용
		for(Product product :cart){
			// for(인터페이스타입 객체 : 배열명)
			product.showInfo();
		}
	}
}
