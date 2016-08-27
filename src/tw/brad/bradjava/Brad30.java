package tw.brad.bradjava;

public class Brad30 {
	public static void main(String[] args) {
		//Brad301 obj1 = new Brad301(2);
		Brad302 obj2 = new Brad302("3");
	}
}
class Brad301 {
	Brad301(int a){
		System.out.println("B");
	}
//	Brad301(){
//		System.out.println("A");
//	}
//	Brad301(byte a){
//		System.out.println("C");
//	}
}

class Brad302 extends Brad301 {
	Brad302(){
		// super();
		super(1);
		System.out.println("D");
	}
	Brad302(int a){
		// super();
		this();
		System.out.println("E");
	}
	Brad302(String b){
		this(1);
		System.out.println("F");
	}
	
	
}


