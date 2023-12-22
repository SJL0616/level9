package _03추상클래스1;

public class GorgonzolaPizza extends Pizza {

	
	GorgonzolaPizza(int price, String brand){
		this.price = price;
		this.brand = brand;
		this.name = "고르곤졸라 피자";
	}
	
	@Override
	void putTopping() {
		// TODO Auto-generated method stub
		System.out.println(" 고르곤졸라 치즈만 사용한 토핑");
	}

}
