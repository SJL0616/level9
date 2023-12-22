package game_Sangjun;

public class Swordman extends Unit implements Attacker{

	protected Weapon weapon;
	
	public Swordman(Side side, int hp) {
		super(side, hp);
		this.weapon = Weapon.SWORD;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defaultAttack(Unit target) {
		// TODO Auto-generated method stub
		System.out.println(this+"가 검 공격으로"+target+"을 공격! -10 데미지");
		target.setHp(10);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getSide().toString()+ " 진영의 소드맨 ["+getHp()+"|"+getMAXHP()+"]";
	}

}
