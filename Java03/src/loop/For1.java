package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 너무 가독성이 떨어져서
		
		// 0 ~ 9 까지 while출력
		
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		//while 단점 : 바깥에 플래그를 만들어줘야함, {}안에서 플래그 증감, 결론으로 가독성 떨어짐
		
		// 0 ~ 9 까지 for
		// for : 플래그 관련 코드는 ()에 몰아버리자 반복할 코드만 {}에 남기자
		
		for(int j = 0; j< 10; j++) {
			System.out.println("for:"+j);
		}
		
		//for(초기값;조건식;증감량){반복할코드;}
		//장점: while에 비해 가독성이 좋고 개발에 편리
		//for문의 단점 : while 만큼 자유롭지는 않음
	}
	

}
