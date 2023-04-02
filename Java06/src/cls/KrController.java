package cls;

public class KrController {
	public static void main(String[] args) {
		KrModel km = new KrModel();
		KrModel km2 = new KrModel();
		KrView kv = new KrView();

		km.setStr("hi");
		km2.setStr("gg");
		km.setNum(123);
		km2.setNum(156);
		
		KrService ks = new KrService();
//		ks.decoEquals(km);
//		ks.decoPlus(km2);
		
		kv.printNum(km);
		kv.printNum(km2);
		kv.printStr(km2);
		kv.printStr(km);
		
		kv.printStr(km);
		kv.printStr(km);
		
		ks.decoEquals(km);
		ks.decoPlus(km2);
		
		kv.printStr(km);
		kv.printStr(km);
		
//집가서 보기좋게 바꾸기 
	}

}

// KrModel 클래스 (num,str / 메서드 : get, set)
class KrModel {

	int num;
	String str;

	void setNum(int num) {
		this.num = num;
	}

	void setStr(String str) {
		this.str = str;
	}

	int getNum() {
		return num;
	}

	String getStr() {
		return str;
	}

}
// KRView 클래스 (출력용)

class KrView {
	void printNum(KrModel km) {
		System.out.println(km.getNum());
	}

	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

//KrService (자바기능)	
class KrService {
// 출력하기전에 꾸며주기
	void decoEquals(KrModel km) {
		// 양 옆에 == 표시
		km.setStr("==" + km.getStr() + "=="); // 문자열을 가져온다음 == 을 붙여서 저장
	}

	void decoPlus(KrModel km) {
		// 양옆에 + 표시
		//km.setStr("+" + km.getStr() + "+"); // 문자열을 가져온 다음 + 을 붙여서 저장
		km.str = "+" + km.str + "+";
	}

}
