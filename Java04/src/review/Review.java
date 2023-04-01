package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.1~10 중 짝수만 출력하기
		// for(초기값;조건식;증감량){반복할 코드;}
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다하고 종료, 기회를 모두 사용하면 접속불가)
		int pwd = 1234;
		int user_input = 0;

		// if문
		// 3. 시험합격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달

		int kor = 39;
		int math = 40;
		int eng = 40;
		int total = 0;

		total = kor + math + eng;

		if (kor >= 40 && eng >= 40 && math >= 40) {
			// 과락x
			if (total >= 150) {
				System.out.println("합격");
			} else {
				System.out.println("총점 미달");
			}
		} else {
			System.out.println("과락");
		}
		
		// 4. 1~10까지의 합 구하기 (반복문)
		// 55 
		int sum = 0;
		for(int i =1; i<=10;i++) {
			sum +=i;
			
		}
		System.out.println(sum);

		//5. 10~1까지 거꾸로 출력
		
		for(int i =10; i>=1;i--) {
			System.out.println(i);
		}
	}

}
