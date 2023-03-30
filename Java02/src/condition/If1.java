package condition;

public class If1 {
	public static void main(String[] args) {
		// 프로그램 코드는 기본적으로 위에서 아래로, 왼쪽에서 오른쪽으로 진행
		// 이 흐름을 조정할 수 있는 문접이 제어문
		
		// 제어문 : 조건문, 반복문 , 그 외 
		// if, switch, while , for , break , continue
		// 조건문 : if, switch
		// 반복문 : for, while , dowhile
		// 기타제어문 : break, continue
		
		// if(){} , (): 조건식 , {} 조건식이 true 일때만 실행할 코드
		if(3 > 2) {
			System.out.println("조건이 맞았습니다.");
			System.out.println("실행");			
		}
		
		int num = 9;		//외부에서 주어진 값
		if(num < 10) {		// 들어온 값을 통해서 코드 실행 여부 결정 
			System.out.println("숫자는 10보다 작습니다.");
		}
	}

}
