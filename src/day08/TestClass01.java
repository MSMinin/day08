package day08;

import java.util.Scanner;

public class TestClass01 {
	public String ip() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요. : ");
		String str = sc.next();
		
		return str;
	}
	
	public void op(String s) {
		System.out.println("입력된 이름은 " + s + "입니다.");
	}
}
