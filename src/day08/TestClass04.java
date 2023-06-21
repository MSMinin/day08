package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass04 {
	
	public ArrayList<Integer> ip() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();

		for(int i =0; i < 2; i++ ) {
			System.out.print((i+1) + "번째 값을 입력해주세요. : ");
			num.add(sc.nextInt());
		}			
		return num;
	}
	
	public void op(int sum) {
		System.out.print("두 값의 합은 : " + sum);
	}
	
	public int cal(ArrayList<Integer> num) {
		int sum = 0;
		for(int i = 0; i < num.size(); i++) {
			sum += num.get(i);
		}
		return sum;
	}
}
