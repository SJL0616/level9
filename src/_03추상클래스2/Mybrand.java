package _03추상클래스2;

public abstract class Mybrand {
	
	static final String SLOGAN ="우리 %s 매장은 가성비가 좋다.";
	final int NO;
	final String NAME;
	
	public Mybrand(int no, String name) {
		NO = no;
		NAME = name;
	}
	
	public String info() {
		return "%d %s 점".formatted(NO, NAME);
	}
	
	public abstract void takeOrder();
	
}
