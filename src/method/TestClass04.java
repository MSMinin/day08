package method;

import java.util.Scanner;

public class TestClass04 {
	/*
	  메소드 이름을 지정하는 경우 첫 문자는 소문자
	  합성어의 첫 문자는 대문자로 지으며
	  해당하는 기능에 부합한 이름을 지정한다.
	 */
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력 : "); 
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
}
