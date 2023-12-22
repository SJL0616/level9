package Zombie_Sangjun;

import java.util.ArrayList;
import java.util.Scanner;

class ZombieGame{
	private ArrayList<Unit> units;
	private Scanner sc;
	private Unit player;
	private Unit enemy;
	private int enemyCnt;
	private void init(){
		sc = new Scanner(System.in);
		enemy = null;
		enemyCnt = 3;
		units = new ArrayList<Unit>();
		units.add(new Hero(0, 5, 100, 40));
		player = units.get(0);
		units.add(new Boss(4, 3, 50, 20));
		units.add(new Zombie(6, 3, 50, 20));
		units.add(new Zombie(8, 3, 50, 20));
		
	}
	
	ZombieGame(){
		init();
		
	}
	
	private Unit isFounded(Unit h) {
		for(Unit u : units) {
			if(u == h ) continue;
			if(u.getPos() == h.getPos()) {
				return u;
			}
		}
		return null;
	}
	
	int getIntVal(int start , int end) {
		while(true) {
			try {
				System.out.print(start+" ~ "+end +" 값을 입력하세요 >>");
				int num = sc.nextInt();
				if(num < start || num > end) {
					continue;
				}
				return num;
			}catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
				continue;
			}
			
		}
	}
	
	void run(){
		while(true) {
			System.out.println("==============================");
			if(enemy == null) {
				System.out.println("현재 위치"+player.getPos());
				System.out.println("앞으로  이동하기(1) 종료 (2) ");
				int sel = getIntVal(1,2);
				if(sel == 2) break;
				if(sel ==1) {
					player.setPos(player.getPos() +1);
					enemy =  isFounded(player);
					if(enemy != null) {
						System.out.println("좀비와 조우했다.");
					}
				}
			}else {
				enemy.recovery();
				System.out.println("앞으로  공격하기(1) 포션마시기 (2) ");
				int sel = getIntVal(1,2);
				if(sel ==1) {
					player.attack(enemy);
					if(enemy.isdead()) {
						units.remove(enemy);
						enemy = null;
						enemyCnt--;
					}
				} else if(sel == 2) {
					player.recovery();
				}
				if(enemy != null) {
					enemy.attack(player);
					if(player.isdead()) {
						System.out.println("히로가 죽었습니다. -END-");
						break;
					}
				}
				
			}
			if(enemyCnt ==0) {
				System.out.println("승리 !");
				break;
			}
		}
	}
}


public class _gameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZombieGame game = new ZombieGame();
		game.run();
	}

}
