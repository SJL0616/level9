package game_Sangjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swordman rs1 = new Swordman(Side.RED, 20);
		Swordman rs2 = new Swordman(Side.RED, 20);
		Knight rk1 = new Knight(Side.RED, 25);
		Horse<Knight> rh1 = new Horse<Knight>(Side.RED, 30);
		MagicKnight rm1 = new MagicKnight(Side.RED, 20);
		rh1.setRider(rk1);
		
		
		
		Swordman bs1 = new Swordman(Side.BLUE, 20);
		Swordman bs2 = new Swordman(Side.BLUE, 20);
		Knight bk1 = new Knight(Side.BLUE, 25);
		Horse<Knight> bh1 = new Horse<Knight>(Side.BLUE,30);
		bh1.setRider(bk1);
		
		System.out.println("==========");
		
		List<Unit> redTeam = new ArrayList<>(Arrays.asList(rs1,rs2,rk1,rm1));
		List<Unit> blueTeam = new ArrayList<>(Arrays.asList(bs1,bs2,bk1));
		
		for(Unit u : redTeam) {
			System.out.println(u);
		}
		for(Unit u : blueTeam) {
			System.out.println(u);
		}
		
		rm1.defaultAttack(blueTeam.get(0));
		rs2.defaultAttack(blueTeam.get(1));
		rk1.defaultAttack(blueTeam.get(2));
		System.out.println(blueTeam.get(2));
		rk1.switchWeapon();
		rk1.defaultAttack(blueTeam.get(2));
		System.out.println(blueTeam.get(2));
		rk1.defaultAttack(blueTeam.get(2));
		System.out.println(blueTeam.get(2));
		rk1.defaultAttack(blueTeam.get(2));
		System.out.println(blueTeam.get(2));
	}

}
