package CollectionInJava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList<>();
		al.add(10);
		al.add(10.30f);
		al.add("ScriptQA");
		al.add(10);
		al.add(10.30f);
		al.add(null);
		System.out.println(al.get(2));
		System.out.println(al);
		
	//	for(Object element:al) {
	//		System.out.println(element);
	//	}
		
		
	}

}
