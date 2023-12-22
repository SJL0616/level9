package _08제네릭클래스;

import java.util.List;
import java.util.Objects;

class Pizza {
	String name;
	int price;
	int num;

	public Pizza(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

class MyVector<T> {
	private Object[] arr;
	private int size;
	private int capacity;

	public MyVector(int capacity) {
		arr = new Object[capacity];
		this.size = 0;
		capacity = size;
	}

	int size() {
		return size;
	}

	int capacity() {
		return capacity;
	}

	void add(T val) {
		if (size >= capacity) {
			Object[] temp = arr;
			arr = new Object[capacity + 10];
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
			capacity += 10;
		}
		arr[size] = val;
		size++;
	}
	
	void set(int idx , T val) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		arr[idx] = val;
	}

	T get(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		return (T) arr[idx];
	}

	void remove(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		arr[idx] = null;

		for (int i = idx; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = null;
		size--;
	}

	void remove(Object val) {
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				idx = i;
			}
		}
		if (idx == -1)
			return;
		arr[idx] = null;

		for (int i = idx; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[size - 1] = null;
		size--;
	}

	void clear() {
		for (int i = 0; i < size; i++) {
			arr[i] = null;
		}
		size = 0;
	}
}

public class _Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector<Pizza> list = new MyVector(10);
		list.add(new Pizza("모짜", 10000, 1001));
		list.add(new Pizza("렐라", 10000, 1001));
		list.add(new Pizza("렐라2", 10000, 1001));
		list.add(new Pizza("렐라3", 10000, 1001));
		list.add(new Pizza("렐라4", 10000, 1001));
		System.out.println(list.get(0).name);
		System.out.println(list.get(1).name);

		Pizza p1 = list.get(1);
		Pizza p2 = list.get(3);
		Pizza p3 = list.get(4);
		list.remove(p1);
		list.remove(p2);
		list.remove(p3);
		list.set(1, new Pizza("맛ㄴ나", 0, 0));
		for (int i = 0; i < list.size(); i++) {

			System.out.println(i + " " + list.get(i).name);
		}
		list.clear();
		for (int i = 0; i < list.size(); i++) {

			System.out.println(i + " " + list.get(i).name);
		}
		
		String n1 = "cc";
		String n2 = "cc";
		int n3 = 3;
		
		System.out.println(Objects.equals(p1,p2));
	}

}
