package tw.brad.bradjava;

public class Brad15 {

	public static void main(String[] args) {
		brad:
		for (int j=3; j>0; j--){
			for (int i=0; i<3; i++){
				System.out.println(i + ";" + j);
				if (i==1){
					break brad;
				}
			}
		}
	}

}
