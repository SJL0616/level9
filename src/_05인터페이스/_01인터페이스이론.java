package _05인터페이스;

abstract class A{
	
}

class b1 implements E2{

	@Override
	public void test4(E2 i) {
		i.info();
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("b1");
	}
	
}
class b2 implements E2{

	@Override
	public void test4(E2 i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("b2");
	}
	
}
interface E2{
	int num = 20; //public static 생략
	void test4(E2 i); //public abstarct 생략
	void info();
}
interface E1{
	int num = 20; //public static final생략 (상수 변수
	void test3(); //public abstarct 생략
	
}

public class _01인터페이스이론 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 b = new b1();
		b2 b2 = new b2();
		b.test4(b2);
	}

}
