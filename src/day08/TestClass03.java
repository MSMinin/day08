package day08;

import java.util.Scanner;

public class TestClass03 {
	public int[] ip() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "번째 값을 입력해주세요. : ");
			num[i] = sc.nextInt();
		}
		return num;
	}
	
	public void op(int sum) {
		System.out.print("두 값의 합은 : " + sum);
	}
	
	public int cal(int[] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
}
