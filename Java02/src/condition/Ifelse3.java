package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age>=20) {
			System.out.println("성인");			
		}else if(age>13) {
			System.out.println("청소년");
		}else {
			System.out.println("어린이");
		}
		// 2. 학점계산 ( 90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		System.out.print("학점을 입력하세요 : ");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else { 
			System.out.println("F");
		}
		// 3. 비밀번호를 정해놓고 사용자가 비밀전호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다.
		System.out.print("비밀번호를 입력하세요 : ");
		int pwd = 1234;
		int num = sc.nextInt();
		
		if(pwd==num) {
			System.out.println("비밀번호가 맞습니다");
		}else {
			System.out.println("비밀번호가 틀립니다");
		}
		//4. 윤년 판별하기
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();	
		
		if(year%400==0) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
		sc.close();
	}
		
		
}
