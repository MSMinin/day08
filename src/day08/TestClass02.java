package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass02 {
	public String[] ip() {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		for(int i =0; i < str.length; i++) {
			System.out.print((i+1) + "번째 이름 입력 : ");
			str[i] = sc.next();
		}	
		return str;
	}
	
	public void op(String[] str) {
		for(int i =0; i < str.length; i++) {
			System.out.println((i+1) + "번째 이름 : " + str[i]);
		}
	}
}
