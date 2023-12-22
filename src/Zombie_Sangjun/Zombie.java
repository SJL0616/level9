package Zombie_Sangjun;



//좀비는 히어로 공격 가능하고 한턴이 지날때마다 현재 체력의 50%를 회복하는 능력을 가지고 있다 
public class Zombie extends Unit {

	private int lastDamage;
	
	public void setLastDamage(int lastDamage) {
		this.lastDamage = lastDamage;
	}

	public Zombie(int pos, int power, int hp, int maxAttackRange) {
		super(pos, power, hp, maxAttackRange);
		lastDamage =0;
		// TODO Auto-generated constructor stub
	}

	void recovery(){
		if(lastDamage == 0 || isdead)return;
		hp += lastDamage/2;
		System.out.println("좀비의 hp가" + lastDamage/2+"만큼 회복되었다."+hp);
		lastDamage = 0;
	}
	
	@Override
	void attack(Unit unit) {
		int damage = rd.nextInt(MAX-1)+1;
		String atWay = "일반";
		unit.setHp(unit.getHp() - damage);
		
		Hero h = (Hero)unit;
		System.out.println("좀비가 "+damage+"의 공격력으로"+h.getClass().getSimpleName()+"에게 "+atWay+" 공격 =>");
		System.out.println("== > "+h.getClass().getSimpleName()+"의 현재 체력:"+h.getHp());
		
	}

}
