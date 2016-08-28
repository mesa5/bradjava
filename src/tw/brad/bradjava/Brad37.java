package tw.brad.bradjava;

public class Brad37 {
	public static void main(String[] args) {
		final int d;
		d = 12;
		System.out.println(Brad376.a);
	}
}
interface Brad371 {void m1();}
interface Brad372 {void m2();}
class Brad373 implements Brad371, Brad372 {
	public void m1(){}
	public void m2(){}
}
interface Brad374 extends Brad371 {
	void m3();
}
interface Brad375 extends Brad371, Brad372 {
	int a = 10;		// public final static
	void m3();		// public
}
class Brad376 implements Brad375 {
	int b;
	final int c;
	
	Brad376(){c=12;}
	@Override
	public void m1() {
		b++;
		//a=1;
	}
	@Override
	public void m2() {
	}
	@Override
	public void m3() {
	}
}


