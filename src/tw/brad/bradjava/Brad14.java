package tw.brad.bradjava;

public class Brad14 {

	public static void main(String[] args) {
		// for (int i=1; i<=100; i++){
		// 判斷是否為質數
		// System.out.print(i + " ");
		// if (i % 10 == 0){
		// System.out.println();
		// }
		// }

		for (int j = 0; j < 10; j++) {
			for (int i = 1; i <= 10; i++) {
				int v = j * 10 + i;
				// 判斷是否為質數
				boolean isOK = true;
				for (int k=2; k<=v/2; k++){
					if (v % k == 0){
						// 你不是質數
						isOK = false;
						break;
					}
				}
				
				System.out.print(v + (isOK?"*":" ")  + " ");
			}
			System.out.println();
		}

	}

}
