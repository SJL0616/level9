package Zombie_Sangjun;

//보스인지 아닌지 구분해서 공격 
//히어로는 체력 포션으로 100 체력 회복할 수 있고 체력 포션이 없으면 체력 회복이 안된다 
//외부의 적은 보스인지 아닌지 구별해서 공격 해야한다 
//보스이면 보호막을 가지고 있다 먼저 보호막을 다 뚫어야지만 직접 보스를 공격할 수 있다. 
//일반 적은 보호막 가지고 있지 않음 
public class Hero extends Unit {

	private int potionCnt;
	public Hero(int pos, int power, int hp, int max) {
		super(pos, power, hp, max);
		potionCnt = 3;
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack(Unit unit) {
		
		int trueDamage = rd.nextInt(MAX) + 1;
		int damageToBody = trueDamage;
		String target = unit instanceof Boss ? "보스" :"좀비";
		
		if(unit instanceof Boss && ((Boss) unit).getShieldGage() != 0) {
			int leftShield = ((Boss) unit).calcShieldGage(trueDamage);
			damageToBody = leftShield > 0 ? 0 : leftShield *-1;
		}
		
		unit.setHp(unit.getHp() - damageToBody);
		((Zombie)unit).setLastDamage(damageToBody);
		
		System.out.println("히어로가 "+trueDamage+"의 공격력으로 "+target+"에게 공격 =>");
		if(unit instanceof Boss) System.out.println("보스의 남은 실드량 :"+((Boss) unit).getShieldGage());
		System.out.println("== > "+target+"의 현재 체력:"+unit.getHp());
	}

	@Override
	void recovery() {
		if(potionCnt <= 0) {
			System.out.println("포션이 없습니다.");
			return;
		}
		hp = 100;
		potionCnt -=1;
		System.out.println("히로가 포션으로 체력이 100이 되었습니다.");
		System.out.println("남은 포션 갯수 :"+potionCnt);
	}

}
