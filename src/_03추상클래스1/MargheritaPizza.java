package _03추상클래스1;

public class MargheritaPizza extends Pizza {

	
	MargheritaPizza(int price, String brand){
		this.price = price;
		this.brand = brand;
		this.name = "마르게리따 피자";
	}
	
	@Override
	void putTopping() {
		// TODO Auto-generated method stub
		System.out.println(" 바질, 모차렐라 치즈, 토마토 소스 3가지만 사용한 토핑");
	}

}
