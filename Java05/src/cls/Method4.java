package cls;

public class Method4 {
	public static void main(String[] args) {
		// 객체화
		MyClass7 mc7 = new MyClass7();
		
		int result = mc7.더하기(3, 5);
		System.out.println(result);
		
		int result2 = mc7.빼기(7, 3);
		System.out.println(result2);
		
		int result3 = mc7.곱하기(3, 5);
		System.out.println(result3);
		
		double result4 = mc7.나누기(4, 0);
		System.out.println(result4);
		
		int result5 = mc7.나머지구하기(10,3);
		System.out.println(result5);
	}

}

class MyClass7 {
	int num1;
	int num2;

	// 더하기 +

	int 더하기(int num1, int num2) {
//		int result = num1+num2;
//		return result;
		return num1+num2;
	}


	// 빼기 -

	int 빼기 (int num1, int num2) {
		int result2 = num1-num2;
		return result2;
	}
	//곱하기 *
	
	int 곱하기 (int num1, int num2) {
		int result3 = num1*num2;
		return result3;
	}
	//나누기(0으로 나누면 결과를 0 으로) /
	
	double 나누기 (int num1,int num2) {
		double result = 0.0;
		if(num2 ==0) {
			return result;
		}else {
			result = num1/num2;
			return result;
		}
//		int result4 = num1/num2;
//		return result4;
	}
	int 나머지구하기(int num1,int num2) {
		int result = num1-(num1/num2)*num2;
		return result;
	}
}
