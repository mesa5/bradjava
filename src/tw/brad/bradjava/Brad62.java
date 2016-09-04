package tw.brad.bradjava;

import java.util.HashSet;

public class Brad62 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);
		set.add("brad");
		set.add(12.3);
		set.add(12);
		set.add("brad");
		set.add(12);
		set.add(false);
		set.add("brad");
		set.add(new Bike());
		set.add(new Bike());
		System.out.println(set);
	}

}
