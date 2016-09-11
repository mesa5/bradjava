package tw.brad.bradjava;

public class Brad68 {

	public static void main(String[] args) {
		Brad681 obj1 = new Brad681("A");
		Brad681 obj2 = new Brad681("B");
		obj1.start();
		obj2.start();
	}

}
class Brad681 extends Thread {
	private String name;
	Brad681(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
