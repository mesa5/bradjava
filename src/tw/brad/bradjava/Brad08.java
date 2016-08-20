package tw.brad.bradjava;

public class Brad08 {

	
	public static void main(String[] args) {
		int a = 10, b = 3;

		int c = a & b;
		System.out.println(c);
		
		if (--a >= 10 & b++ <= 3){
			System.out.println("OK:a=" + a + ",b=" + b);
		}else{
			System.out.println("XX:a=" + a + ",b=" + b);
		}
	}

}
