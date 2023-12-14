package 접근제어자실습;

import 상속_개념.AccessTest;
class AccessTestChid extends AccessTest {
	public AccessTestChid() {
		super.a = 3;
		b = 4;
		// TODO Auto-generated constructor stub
	}
	
}
public class _Main {

	public static void main(String[] args) {
		AccessTest a = new AccessTest();
		System.out.println(a);
		AccessTestChid b=  new AccessTestChid();
		System.out.println(b.a+" , ");
	}
}
