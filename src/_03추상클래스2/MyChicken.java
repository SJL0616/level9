package _03추상클래스2;

public class MyChicken  extends Mybrand{
	public static String getSlogan() {
		return SLOGAN.formatted("맛나치킨");
	}
	private static int myNum =0;
	
	public MyChicken(String name) {
		super(++myNum, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void takeOrder() {
		System.out.println("치킨 주문");
		
	}

}
