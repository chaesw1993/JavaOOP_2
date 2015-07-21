package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : Chae S W
 * @ Story : 추상화와 다양성의 결합형태를 보는 예제
 */
public class Orange implements FruitsInterface{

	@Override
	public void display(String str) {
		System.out.println(str + " 오렌지 입니다.");
	}
	public int count(){		
		/* 
			리턴타입이 존재할때 코딩하는 방법
			1. 리턴 타입의 지변을 초기화 한다.
		 	2. return 지변;
		 
		 	예)
		 	int i=0;
		 	String str="";
		 	Class class=null;
		*/
		int count=100;
		return count;
	}
}
