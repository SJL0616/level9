package game_Sangjun;

public class Horse<T extends Knight> extends Unit{

	public Horse(Side side, int hp) {
		super(side, hp);
		// TODO Auto-generated constructor stub
	}
	
	public void setRider(T rider) {
		System.out.println(rider+"가 말에 올라탔다. hp+="+getHp());
		rider.setMyHorse(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  " 말 (추가 체력: %d".formatted(getHp())+")";
	}
	
	
}
