package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.1~10 중 짝수만 출력하기 
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i+" ");
		}
		
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다하고 종료, 기회를 모두 사용하면 접속불가)
		
		int pwd = 1234;
		
		for(int i=0; i<5; i++) {
			System.out.print("비밀번호 입력 >>");
			int num = sc.nextInt();
			if(pwd ==num) {
				System.out.println("비밀번호를 맞췄습니다");
				break;
			}else {
				System.out.println("다시 시도해주세요");
			}if(i==4) {
				System.out.println("접속불가");
			}
		}
	}
}
