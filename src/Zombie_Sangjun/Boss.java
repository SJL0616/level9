package Zombie_Sangjun;


//Boss 클래스는 Zombie 클래스를 상속받는다.
//Boss 클래스는 보호막 shield 멤버변수를 가진다.
//공격 메소드 void attack( Unit enemy ) 
//일반공격 : 1~공격력(max) 사이의 랜덤 값을 공격력으로 사용하여 enemy의 체력 감소시킴 (출력 예 : “보스가 15 의 공격력으로 일반 공격 : 현재 Hero의 hp는 25”)
//필살기 : 25%의 확률로 1~max 사이의 공격력의 2배 만큼으로 상대를 공격하는 기능 (출력 예 : “보스가 30 의 공격력으로 필살기 공격 : 현재 Hero의 hp는 25”)
//Boss 클래스는 생성자를 가짐(현재위치, 체력,공격력, 보호막)


public class Boss extends Zombie{

	private int shieldGage;
	
	public int getShieldGage() {
		return shieldGage;
	}

	public int calcShieldGage(int damage) {
		int leftShield = this.shieldGage - damage;
		this.shieldGage = leftShield > 0 ? leftShield : 0;
		return leftShield;
	}

	public Boss(int pos, int power, int hp, int max) {
		super(pos, power, hp, max);
		shieldGage = hp/2;
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack(Unit unit) {
		int damage = rd.nextInt(MAX-1)+1;
		String atWay = "";
		if(rd.nextInt(100)+1 <=25) {
			atWay = "일반";
		}else {
			damage *=2;
			atWay = "필살기";
		}
		unit.setHp(unit.getHp() - damage);
		
		Hero h = (Hero)unit;
		System.out.println("보스가 "+damage+"의 공격력으로"+h.getClass().getSimpleName()+"에게 "+atWay+" 공격 =>");
		System.out.println("== > "+h.getClass().getSimpleName()+"의 현재 체력:"+h.getHp());
	}

}
