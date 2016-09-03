package tw.brad.bradjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Brad48 {
	public static void main(String[] args) {
		File f1 = new File("dir1/brad01.txt");
		try {
			FileReader reader = 
				new FileReader(f1);
			int c;
			while ( (c = reader.read()) != -1){
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
		}
	}
}
