package _03추상클래스2;

import java.util.ArrayList;

public class _Main {

	public static void main(String[] args) {
		Mybrand[] brands = new Mybrand[6];
		brands[0] = new Mybakery("빵빵", false);
		brands[1] = new Mybakery("팡팡", false);
		brands[2] = new Mybakery("방방", true);
		brands[3] = new Mybakery("붕붕", true);
		brands[4] = new MyCafe("뜨끈", false);
		brands[5] = new MyChicken("까깍치킨");
		
		
		for(Mybrand b : brands) {
			if(b instanceof Mybakery) {
				System.out.println(b.info());
				System.out.println(Mybrand.SLOGAN.formatted(b.NAME));
				b.takeOrder();
				System.out.println("============");
			}
			
		}
		
	}

}
