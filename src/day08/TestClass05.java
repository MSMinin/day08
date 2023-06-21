package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass05 {
	public HashMap<String, String> map1() {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		System.out.println("map : " + map);
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("없는 값"));
		return map;
	}
	
	public void map2() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num", 100);
		map.put("age", 20);
		System.out.println("map : " + map);
		
		int num = map.get("age");
		System.out.println("num : " + num);
		System.out.println("map.get(num) : " + map.get("num"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(10000));
		
		map.put("age", 100);
		System.out.println("map : " + map);
		
		map.remove("age");
		System.out.println("remove 결과 : " + map);

	}
	
	public void map3() {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "산골짜기");
		System.out.println("map : " + map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set<String> set =  map.keySet();
		System.out.println("set : " + set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
	
	public void map4(){
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		map.put("선풍기", 100);
		map.put("자동차", 200);
		map.put("에어컨", 300);
		System.out.println(map);
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
