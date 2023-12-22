package _03추상클래스1;

import java.util.ArrayList;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaService ps = new PizzaService();
		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(new MargheritaPizza(10000, "내맘피자"));
		pizzaList.add(new GorgonzolaPizza(8000, "내맘피자"));
		pizzaList.add(new PepperoniPizza(7000, "내맘피자"));
		
		ps.orderPizzas(pizzaList);
	}

}
