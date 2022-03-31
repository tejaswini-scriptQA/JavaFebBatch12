package CollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1001, "Tom");
		map.put(1003, "Ajay");
		map.put(1003, "amit");
		map.put(1005, "java");
		System.out.println(map);
		
	}

}
