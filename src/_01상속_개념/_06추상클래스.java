package _01상속_개념;

abstract class AbstractTest{
	int one;
	AbstractTest(){
		System.out.println("부모");
	}
	abstract void setNum();
}

class normalClass extends AbstractTest{

	
	normalClass(){
		System.out.println("자식");
	}
	@Override
	void setNum() {
		// TODO Auto-generated method stub
		super.one = 3;
	}
	
}



public class _06추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		normalClass n  = new normalClass();
		n.setNum();
		System.out.println(n.one);
		
	}

}
