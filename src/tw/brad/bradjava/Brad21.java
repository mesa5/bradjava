package tw.brad.bradjava;

public class Brad21 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		int[] d = new int[2];
		int e = 2;
		a = new int[3][2];
		b = new int[4][];
		b[0] = new int[2];
		b[1] = new int[3];
		System.out.println(b[1].length);
		//c = new int[][3];
		
		int[] f = {1,2,3,4};
		System.out.println(f.length);
		for (int i=0; i<f.length; i++){
			System.out.println(f[i]);
		}
		System.out.println(f);
		System.out.println("-----");
		f = new int[3];
		System.out.println(f);
		System.out.println(f.length);
		for (int i=0; i<f.length; i++){
			System.out.println(f[i]);
		}
		
		
		
		
		
		
	}

}
