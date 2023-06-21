package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {
	// void : return값이 없는 경우
	public void test1() {
		int num = 1;
		if(num == 1) {
			System.out.println("if 실행");
			return;
		}
		System.out.println("다음 문장들 실행");
	}
	
	public String test2(String s) {
		
		return null;	
	}
	
	public int test3() {
		int num =1;
		if(num == 1) {
			return 100;
		}
		return 0;
	}
	
//	public int test4() {
//		int num =1;
//		if(num == 1) {
//			return "aaa";
//		}else {
//			return 100;
//		}
//	}
	
	public int[] test5() {
		int n1= 100, n2 = 200;
		int[] arr = {n1,n2};
		return arr;
	}
	
	public HashMap<String, String> test06(ArrayList<String> arr) {
		String s = arr.get(0);
		System.out.println("0 : " + s);
		System.out.println("1 : " + arr.get(1));
		
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "값111");
		String re = map.put("키2", "값222");
		System.out.println("re :" + map.get("키2"));
		return map;
	}
}
