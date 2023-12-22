package Zombie_Sangjun;

import java.util.Random;

//유닛은 전부 이동가능하며 pos는 현재 위치를 나타낸다 
//맵은 ~10까지 존재하며 한칸씩 이동 가능하다
//유닛들은 전부 attack 메서드를 구현한다 

public abstract class Unit {
	private int pos; // 현재위치 
	private int power;
	protected int hp; // 현재 hp
	protected final int MAX; // 랜덤 공격 1부터 max 까지의 범위 
	protected boolean isdead; // 죽었는지 살았는지 
	protected Random rd; // 각각 하위 유닛들이 이 랜덤 클래스 사용해서 공격 범위 지정 
	
	public Unit(int pos,int power, int hp, int max) {
		this.pos = pos;
		this.power = power;
		this.hp = hp;
		this.MAX =  max;
		this.isdead = false;
		this.rd = new Random();
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		if(hp <= 0) {
			this.hp = 0;
			isdead = true;
		}
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	

	public void setIsdead(boolean isdead) {
		this.isdead = isdead;
	}

	public boolean isdead() {
		return isdead;
	}

	abstract void recovery();
	abstract void attack(Unit unit);
}
