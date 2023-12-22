package game_Sangjun;

public class MagicKnight extends Knight {

	private int mana =60;
	private final int MAXMANA = 60;
	public MagicKnight(Side side, int hp) {
		super(side, hp);
		weapon = Weapon.STAFF;
	}
	
	@Override
	public void defaultAttack(Unit target) {
		// TODO Auto-generated method stub
		lightingAttack(target);
	}
	
	public void lightingAttack(Unit target) {
		System.out.println(this+"가 ⚡️ 공격으로"+target+"을 공격! -25 데미지.");
		target.setHp(25);
		mana -= 20;
	}
	
	@Override
    public String toString() {
		return getSide().toString()+ " 진영의 매직 나이트["+getHp()+"|"+getMAXHP()+" / "+mana +"|"+MAXMANA+"]";
    }
}
