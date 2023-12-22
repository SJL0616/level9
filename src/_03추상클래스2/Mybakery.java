package _03추상클래스2;

public class Mybakery extends Mybrand{

	private static int myNum = 0;
	private boolean isEatInside;
	
	public Mybakery(String name, Boolean isEatInside) {
		super(++myNum, name);
		this.isEatInside = isEatInside;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeOrder() {
		System.out.println("빵집 배달 주문~");
		if(isEatInside) {
			System.out.println("매장 취식~");
		}
	}

}
