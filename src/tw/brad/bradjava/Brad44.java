package tw.brad.bradjava;

import java.io.File;
import java.io.IOException;

public class Brad44 {

	public static void main(String[] args) {
		File f1 = new File("dir1/brad02.txt");
		if (f1.isFile()){
			System.out.println("exist");
		}else{
			try {
				if (f1.createNewFile()){
					System.out.println("create ok");
				}else{
					System.out.println("create fail");
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		
	}

}
