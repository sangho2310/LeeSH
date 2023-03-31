package condition;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		// 제어문 : if , switch, while ,for , break, continue
		// 조건문 : if , switch
		// if 가 기본 조건문 , switch는 같은 경우만 비교 (가독성)
		
		int num = 0;
		
		//if문
		if(num==0) {
			System.out.println("num은 0이다");
		}else if(num==1) {
			System.out.println("num is 1");
		}else if (num==2) {
			System.out.println("num is 2");
		}else {
			System.out.println("else");
		}
		//이렇게 같은 것을 찾는 조건문은 switch 로 변경 가능
		//switch문
		switch(num) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("else");
		}
		
		// switch ~ case ~ break ~ default
		//퀴즈 : 사용자 입력받기 
		// 1: 안녕하세요
		// 2: 반가워요
		// 3: 잘있어요
		// 4: 다시만나요
		// 1,2,3,4,가 아니면 : 잘못입력하셨습니다
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자를 입력하세요 >>");
		 num = sc.nextInt();
		 
		 switch(num) {
		 case 1:
			 System.out.println("안녕하세요");
			 break;
		 case 2:
			 System.out.println("반가워요");
			 break;
		 case 3:
			 System.out.println("잘있어요");
			 break;
		 case 4:
			 System.out.println("다시만나요");
			 break;
		 default:
			 System.out.println("잘못 입력하셨습니다");
		 }
	}

}
