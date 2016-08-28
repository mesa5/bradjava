package tw.brad.bradjava;

// Exception Call Stack
public class Brad43 {
	public static void main(String[] args){
		Brad433 obj1 = new Brad433();
		try{
			obj1.m3();
		}catch (Exception ee){
		}
	}
}
class Brad431 {
	void m1()throws Exception{
		throw new Exception();
	}
}
class Brad432 extends Brad431 {
	void m2() throws Exception{
		m1();
	}
}
class Brad433 extends Brad432 {
	void m3() throws Exception{
		m2();
	}
}
