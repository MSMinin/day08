package method;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력 : "); 
		num = sc.nextInt();
	
		TestClass06 t = new TestClass06();
		sum = t.sumFunc(num);
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
}
