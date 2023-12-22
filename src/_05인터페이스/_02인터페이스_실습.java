package _05인터페이스;

interface Dragable{
	
	void move(int x, int y);
	
}

interface Clickable{
	
	void click();
	void doubleClick();
}

//클래스의 틀, 구조를 추상화시킨 클래스 = 추상클래스
abstract class Button implements Clickable ,Dragable{
	
	String name;
	int size;
	
	abstract void actionButton();
}

class Title  implements Clickable{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		
	}
	
}

class NaverButton extends Button{

	@Override
	public void click() {
		System.out.println("네이버 버튼 클릭");
		
	}

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		System.out.println("네이버 버튼 더더더더더더블 클릭");
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("("+x+", "+y+")좌표로 이동");
		
	}

	@Override
	void actionButton() {
		System.out.println("네이버 창으로 이동");
		// TODO Auto-generated method stub
		
	}
	
}

class GoogleButton extends Button{

	@Override
	public void click() {
		System.out.println("구글 버튼 클릭");
		
	}

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		System.out.println("구글 버튼 더더더더더더블 클릭");
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("("+x+", "+y+")좌표로 이동");
		
	}

	@Override
	void actionButton() {
		System.out.println("구글 창으로 이동");
		// TODO Auto-generated method stub
		
	}
	
}
public class _02인터페이스_실습 {

	public static void main(String[] args) {
		Button btn1 = new GoogleButton();
		Button btn2 = new NaverButton();
		
		btn1.click();
		btn1.doubleClick();
		btn1.move(1,2);
		btn1.actionButton();
		btn2.click();
		btn2.doubleClick();
		btn2.move(3,4);
		btn2.actionButton();
	}
	
}
