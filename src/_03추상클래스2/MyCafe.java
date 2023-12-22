package _03추상클래스2;

public class MyCafe extends Mybrand{
	private static int myNum =0;
	private boolean isTakeout;
	
	public MyCafe(String nAME, boolean isTakeOut) {
		super(++myNum, nAME);
		this.isTakeout = isTakeOut;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeOrder() {
		System.out.println("카페 주문받기");
		if(!isTakeout) {
			System.out.println("매장에서 드시겠습니다.");
		}
	}

}
