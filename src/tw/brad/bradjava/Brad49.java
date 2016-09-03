package tw.brad.bradjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Brad49 {
	public static void main(String[] args) {
		File f1 = new File("dir1/brad03.txt");
		try {
			FileOutputStream fout = 
				new FileOutputStream(f1, true);
			fout.write("abcdefg\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
