package tw.brad.bradjava;

public class Brad33 {
	public static void main(String[] args) {
		Brad332 obj1 = new Brad332();
		//obj1.m1();
		obj1.m1(3);
		//obj1.m2();
	}
}
class Brad331 {
	int a;
	void m1(){
		System.out.println("Brad331:m1()");
		a++;
	}
}
class Brad332 extends Brad331 {
	int a;
//	void m1(){
//		super.m1();
//		System.out.println("Brad332:m1()");
//	}
	void m1(int a){
		System.out.println(super.a);
		System.out.println(this.a);
		super.m1();
		System.out.println(super.a);
		System.out.println(this.a);
		//a++;
		System.out.println("------");
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
//		System.out.println("Brad332:m1(int):" + this.a++);
	}
	void m2(){System.out.println("Brad332:m2()");}
}







