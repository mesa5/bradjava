
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad55 {
	public static void main(String[] args) {
		Student s1 = new Student(90, 50, 75);
		System.out.println(s1.calTotal());
		System.out.println(s1.calAvg());
		System.out.println(s1);
		
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/student.brad"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}
}

class Student implements Serializable {
	int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng=eng; this.math = math;
	}
	int calTotal(){ return ch+eng+math;}
	double calAvg(){ return calTotal()/3.0; }
}

