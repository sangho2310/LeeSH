package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//for문을통해 구현
		
		//1. 안녕5번
		
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}
		
	    //2. 1~10 합계
		int sum= 0;
		for(int j=1; j<=10; j++) {
			sum+=j;
		}
			System.out.println(sum);
		//3. 1~입력값까지 합계
			
		int sum1 = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지 더할까여?");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			sum1+=i;
			
		}
		
		System.out.println("합계:"+sum1);
	}

}
