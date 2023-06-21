package method;



public class TestClass05 {
	int sum = 0;
	public void sumFunc(int num) {
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
	
}
