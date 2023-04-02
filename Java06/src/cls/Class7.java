package cls;

public class Class7 {
	public static void main(String[] args) {
		Human hm = new Human();
		
		hm.setName("sara");
//		System.out.println(hm.getName());
		hm.setGender("man");
//		System.out.println(hm.getGender());
		hm.setAge(28);
//		System.out.println(hm.getAge());
		
		HumanView hv = new HumanView();
		hv.printInfo(hm);
		
	}
}

// 멤버변수 private
// 메서드 public
class Human{
	//데이터 : name, gender, age
	
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name){
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}

class HumanView{
	public void printInfo(Human hm) {
		//이름 성별 나이를 한번에 안내(출력)
		System.out.println(hm.getName()+" "+hm.getGender()+" "+hm.getAge());
		//"이름 : " + ㅁㄴㅇ + ", 성별 : " + ㅁㄴㅇ + ", 나이 : "  + ㅁㄴㅇ
	}
}