package method;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.name = "\"홍길동\"";
		t.addr = "\"산골짜기\"";
		t.age = 20;
		t.namePrint();
		t.addrPrint();
		t.agePrint();
	}
}
