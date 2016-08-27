package tw.brad.bradjava;

public class Brad32 {
	public static void main(String[] args) {
//		Brad321 obj11 = new Brad321();
//		Brad321 obj12 = new Brad321();
//		Brad322 obj2 = new Brad322();
		Brad323 obj3 = new Brad323();
		System.exit(0);
	}
}

class Brad321 {
	int a = 12;
	static {
		System.out.println("Brad321:static{}");
	}
	{
		System.out.println("Brad321:{}:" + ++a);
	}
	Brad321(){System.out.println("Brad321()");}
	static void m1(){
		System.out.println("Brad321:m1()");
	}
}
class Brad322 extends Brad321 {
	Brad322(){System.out.println("Brad322()");}
}
class Brad323 extends Brad322 {
	Brad323(){System.out.println("Brad323()");}
}



