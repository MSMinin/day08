package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClassQuiz02 {
	// 1번--------------------------------------------
	public int[] test1_1(){ // 입력
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) +"번째 값을 입력하세요. : ");
			num[i] = sc.nextInt();
		}
		
		return num;
	}
	
	public void test1_2(int[] num) { 
		if(num[0] > num[1]) {
			System.out.println("두 수 중 큰 값: " + num[0]);
		}else {
			System.out.println("두 수 중 큰 값: " + num[1]);
		}
		
	}
	// 2번---------------------------------------------
	
	public int test2_1(){ // 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public void test2_2(int num) {
		if(num % 2 == 0) {
			System.out.println("입력한 수는 짝수입니다.");
		}else {
			System.out.println("입력한 수는 홀수입니다.");
		}
	}
	// 3번---------------------------------------------
	public int test3_1(){ // 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public ArrayList<Integer> test3_2(int num) {
		ArrayList<Integer> n = new ArrayList<>();
		for(int i = 1; i <= num; i ++) {
			if(i % 3 == 0) {
				n.add(i);
			}
		}
		return n;
	}
	
	public void test3_3(ArrayList<Integer> n) {
		for(int i = 0 ; i < n.size(); i++) {
			System.out.println(n.get(i));
		}
	}
	// 4번---------------------------------------------	
	public int test4_1(){ // 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public boolean test4_2(int num) { //판별
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void test4_3(Boolean n) {
		if(n == true) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}
	// 5번---------------------------------------------	
	public int test5_1(){ // 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public void test5_2(int num) {
		if(num < 0) {
			System.out.println(Math.abs(num)); 
		}else {
			System.out.println(num); 
		}		
	}
}
