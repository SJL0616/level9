package _05인터페이스;

interface Repairable{
	
}
interface Attackable{
	
	void attack(Damageable damageableUnit);
	
}
interface Damageable{
	void getDamage(int damage);
	
}


class Unit{
	protected final int MAX_HP;
	protected int hp;
	protected String name;
	
	
	Unit(int hp){
		this.MAX_HP = hp;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "%s [%d / %d]".formatted(name, hp,MAX_HP);
	}
	
}


abstract class GroundUnit extends Unit{

	GroundUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}
abstract class AirUnit extends Unit{

	AirUnit(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}
	
}

class Tank extends GroundUnit implements Repairable,Damageable,Attackable{

	Tank(int hp) {
		super(hp);
		name = "탱크";
		System.out.println(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDamage(int damage) {
		hp -= damage;
		if(hp < 0) {
			hp = 0;
		}
		System.out.print((Unit)this +" "+damage+" 데미지 입음\n");
	}

	@Override
	public void attack(Damageable damageableUnit) {
		// TODO Auto-generated method stub
		System.out.print((Unit)this +"의 공격 =>");
		damageableUnit.getDamage(50);
		
	}
}

class Marine extends GroundUnit implements Damageable, Attackable{

	Marine(int hp) {
		super(hp);
		name = "마린";System.out.println(this);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getDamage(int damage) {
		hp -= damage;
		if(hp < 0) {
			hp = 0;
		}
		System.out.print((Unit)this +" "+damage+" 데미지 입음\n");
	}
	@Override
	public void attack(Damageable damageableUnit) {
		// TODO Auto-generated method stub
		System.out.print((Unit)this +"의 공격 =>");
		damageableUnit.getDamage(20);
		
	}
}

class DropShip extends GroundUnit implements Repairable,Damageable{

	DropShip(int hp) {
		super(hp);
		name = "드랍쉽";
		System.out.println(this);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getDamage(int damage) {
		hp -= damage;
		if(hp < 0) {
			hp = 0;
		}
		System.out.print((Unit)this +" "+damage+" 데미지 입음\n");
	}
}

class SCV extends GroundUnit implements Repairable,Damageable,Attackable{

	SCV(int hp) {
		super(hp);
		name = "SCV";
		System.out.println(this);
		// TODO Auto-generated constructor stub
	}
	
	public void Repair(Repairable repairunit) {
		
		Unit unit = (Unit)repairunit;
		unit.hp +=30;
		if(unit.hp > unit.MAX_HP) {
			unit.hp = unit.MAX_HP;
		}
		System.out.println("SCV =>"+unit +" 수리 완료");
	}
	
	@Override
	public void getDamage(int damage) {
		hp -= damage;
		if(hp < 0) {
			hp = 0;
		}
		System.out.print((Unit)this +" "+damage+" 데미지 입음\n");
	}
	
	@Override
	public void attack(Damageable damageableUnit) {
		// TODO Auto-generated method stub
		System.out.print((Unit)this +"의 공격 =>");
		damageableUnit.getDamage(10);
		
	}
}

public class _02인터페이스_실습2 {

	public static void main(String[] args) {
		Tank tank = new Tank(150);
		Marine marine = new Marine(50);
		SCV scv = new SCV(30);
		DropShip dropShip = new DropShip(120);
		tank.attack(marine);
		marine.attack(tank);
		tank.attack(dropShip);
		scv.Repair(dropShip);
		System.out.println("=========");
		System.out.println(tank);
		System.out.println(marine);
		System.out.println(scv);
		System.out.println(dropShip);
	}
	
}
