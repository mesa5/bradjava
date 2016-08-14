package tw.brad.bradjava;

public class Brad06 {

	public static void main(String[] args) {
		int Score = (int) (Math.random() * 101); // 0 - 100
		Score = 84;
		System.out.println(Score);

		if (Score >= 90) {
			System.out.println("A");
		} else if (Score >= 80) {
			System.out.println("B");
			Score = 32;
		} else if (Score >= 70) {
			System.out.println("C");
		} else if (Score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		System.out.println(Score);
		
		
	}

}
