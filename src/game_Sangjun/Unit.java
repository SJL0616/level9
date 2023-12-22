package game_Sangjun;

public class Unit {

	private Side side;
	private int hp;
	private final int MAXHP;
	private boolean isDead;
	
	public Unit(Side side, int hp) {
		super();
		this.side = side;
		this.hp = hp;
		this.MAXHP = hp;
		isDead = false;
	}
	
	public boolean isDead() {
		return isDead;
	}

	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int dmg) {
		if(this.hp - dmg <= 0) {
			this.hp = 0;
			isDead = true;
			System.out.println(this +"유닛이 죽었다.");
		}else {
			this.hp -= dmg;
		}
	}
	
	public int getMAXHP() {
		return MAXHP;
	}
	
}
