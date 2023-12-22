package _03추상클래스1;

public class PepperoniPizza extends Pizza {

	
	PepperoniPizza(int price, String brand){
		this.price = price;
		this.brand = brand;
		this.name = "페페로니 피자";
	}
	
	@Override
	void putTopping() {
		// TODO Auto-generated method stub
		System.out.println("돼지고기, 쇠고기 토핑");
	}

}
