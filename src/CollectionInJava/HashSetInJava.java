package CollectionInJava;

import java.util.HashSet;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs= new HashSet<>();
		hs.add(30);
		hs.add(40);
		hs.add('c');
		hs.add("java");
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.add("Ajay"));
		System.out.println(hs);
		hs.addAll('al2');
		

	}

}
