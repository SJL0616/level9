package _01상속_개념;

import java.security.DomainCombiner;

class A{
	int a;
	A(int a){
		this.a = a;
		System.out.println("호출 A");
	}
	void test01() {
		System.out.println("A");
	}
	
}

class B extends A{
	int b;
	
	B(){
		super(11);
		System.out.println("호출 B"+a);
	}
	@Override
	void test01() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
}

public class _01상속 {
	
	public static void main(String[] args) {
		B b = new B();
		b.test01();
	}
	


}
