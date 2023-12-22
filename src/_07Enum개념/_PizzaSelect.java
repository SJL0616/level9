package _07Enum개념;

import java.util.Objects;

enum PizzaManu {

	PP("페페로니피자", 10000, 0),
	CP("치즈피자", 5000, 1),
	MP("모짜렐라피자", 8000, 2),
	GP("큰피자", 15000, 3);
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNum() {
		return num;
	}

	private final String name;
	private final int price;
	private final int num;

	PizzaManu(String name, int i, int j) {
		this.name = name;
		this.price = i;
		this.num = j;
		// TODO Auto-generated constructor stub
	}
	
	static PizzaManu getMenu(String name) {
		for(PizzaManu menu : PizzaManu.values()) {
			if(menu.name.equals(name)) {
				return menu;
			}
		}
		return null;
	}
}

class PizzaStore{
	
	PizzaManu[] menu = PizzaManu.values();
	void showMenu() {
		for(PizzaManu m : menu) {
			
			System.out.println(m.getName()+" "+m.getNum()+" "+m.getPrice());
		}
	}
	
	void takeOrder(String name) {
		PizzaManu m = PizzaManu.getMenu(name);
		if(m == null) {
			System.out.println("피자가 존재하지 않습니다.");
			return;
		}
		System.out.println(m.getName()+"의 가격은 "+ m.getPrice() +"원입니다.");
	}
	
}

public class _PizzaSelect{
	public static void main(String[] args) {
		
		PizzaStore store = new PizzaStore();
		store.showMenu();
		store.takeOrder("모짜렐라피자");
		
	}
	
}
