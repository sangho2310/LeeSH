package cls;

public class Class3 {
	public static void main(String[] args) {
		//아빠차, 엄마차, 내차 
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 내차 = new Car();
		
		
		아빠차.차주인 = "홍길동";
		아빠차.차종 = "제네시스";
		아빠차.색상 = "검정색";
		아빠차.차정보();
		
		엄마차.차주인 = "홍기동";
		엄마차.차종 = "티코";
		엄마차.색상 = "빨간색";
		엄마차.차정보();
		
		내차.차주인 = "홍기둥";
		내차.차종 = "아반떼";
		내차.색상 = "회색";
		내차.차정보();
	}

}

// Class 자동차 
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지 , 차색상은 무엇인지 안내해주는 출력

class Car {
	
	String 차주인;
	String 차종;
	String 색상;
	
	void 차정보() {
		//System.out.println("주인 : "+차주인, "차종 : "+차종, "색상 : "+색상);
//		System.out.println("차종은 "+차종+"입니다.");
//		System.out.println("색상은 "+색상+"입니다.");
	}
}