package tw.brad.bradjava;

import java.util.LinkedList;

public class Brad63 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(12);
		list.add("brad");
		list.add("brad");
		list.add(12);
		list.add(2,"iii");
		//list.add(7,34);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list);
		
		
	}

}
