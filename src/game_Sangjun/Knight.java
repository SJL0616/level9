package game_Sangjun;

public class Knight extends Swordman {

	private Horse myHorse;
	
	public Horse getMyHorse() {
		return myHorse;
	}

	public void setMyHorse(Horse myHorse) {
		this.myHorse = myHorse;
	}

	public Knight(Side side, int hp) {
		super(side, hp);
		myHorse = null;
		// TODO Auto-generated constructor stub
	}
	
	public void switchWeapon() {
		weapon = weapon.getName().equals("검") ? Weapon.SPEAR : Weapon.SWORD;
	}
	
	private void spearAttack(Unit target) {
		System.out.println(this+"가 창 공격으로"+target+"을 공격! -20 데미지");
		target.setHp(20);
	}
	
	@Override
	public void defaultAttack(Unit target) {
		// TODO Auto-generated method stub
		switch(weapon) {
		     case SWORD:
		    	 super.defaultAttack(target);
		    	 break;
		     case SPEAR:
		    	 spearAttack(target);
		    	 break;
		}
	}
	
	@Override
	public void setHp(int dmg) {
		int damage = dmg;
		if(myHorse != null) {
			int horseHp = myHorse.getHp();
			myHorse.setHp(damage);
			if(myHorse.isDead()) {
				damage = Math.abs(horseHp - dmg);
				myHorse = null;
			}else {
				damage = 0;
			}
		}
		// TODO Auto-generated method stub
		super.setHp(damage);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getSide().toString()+ " 진영의 나이트 ["+getHp()+"|"+getMAXHP()+"]"+ (myHorse != null? myHorse :"");
	}

}
