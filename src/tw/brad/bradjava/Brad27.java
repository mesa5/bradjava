package tw.brad.bradjava;

public class Brad27 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		System.out.println(id1.getId());
		
		if (TWId.isRight(id1.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
		
		
		
	}

}
