package loop;

public class Break1 {
	public static void main(String[] args) {
		//제어문에는 같이 쓰일 수 있는 break 와 continue가 있음
		// break 는 반복문을 강제종료 (자기를 감싸고 있는)
		
		while(true) {
			System.out.println("mugen");
			
			if(true) {
				break;		//자신을 감싸고 있는 반복문을 끝냄
			}
			System.out.println("반복문이 종료되어 이곳은 경유하지 않음");
		}
		System.out.println("반복문 종료");
		
		for(int i=1; i<=10;i++) {
			if(i>3) {
				break;
			}
			System.out.print(i+" ");
		}
	}

}
