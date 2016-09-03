package tw.brad.bradjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad57 {
	public static void main(String[] args) {
		Brad573 obj = new Brad573();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/brad57.gif"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		} catch (Exception e) {
		}
		System.out.println("-------");
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/brad57.gif"));
			Brad573 obj2 = (Brad573)(oin.readObject());
			oin.close();
			System.out.println("OK2");
		} catch (Exception e) {
		}
		
		
	}
}
class Brad571 implements Serializable{
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571 {
	Brad572(){System.out.println("Brad572()");}
}
class Brad573 extends Brad572  {
	Brad573(){System.out.println("Brad573()");}
}



