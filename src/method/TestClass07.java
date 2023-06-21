package method;

import java.util.Scanner;

public class TestClass07 {
	public int inD() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		return num;
	} // 입력
	
	public int opD(int num) {
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	} // 연산
	
	public void printD(int num, int sum) {
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	} // 출력
}
