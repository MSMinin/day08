package day08;

import java.util.ArrayList;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		ArrayList<Integer> num =  t.ip();
		int s = t.cal(num);
		t.op(s);
		
	}
}
