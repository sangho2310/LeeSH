package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40;
		int 수학 = 60;
		
		//합계와 평균 구하시오
		
		/*
		 합계 : 000점
		 평균 : 000점
		 */
		System.out.println("합계 : "+ (국어+영어+수학)+"점");
		System.out.println("평균 : "+ (국어+영어+수학)/3+"점");
		
		int 합계 = 국어+영어+수학;
		System.out.println("합계 : " +합계);
		System.out.println("평균 : " +(double)합계/3);
		
	}

}
