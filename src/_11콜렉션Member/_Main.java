package _11콜렉션Member;

public class _Main {

	public static void main(String[] args) {
		Controller controller = Controller.getInstance();
		controller.init();
		while(true) {
			System.out.println("============= 메뉴 =============");
			System.out.println("1) 추가");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 출력");
			System.out.println("5) 저장");
			System.out.println("6) 로드");
			System.out.println("0) 종료");
			int sel = Util.getIntVal(0+" ~ "+6+" 사이 변수 입력", 0, 6);
			if (sel == 1) {
				controller.getAction("insert").excute();
			}else if (sel ==2) {
				controller.getAction("delete").excute();
			}else if (sel ==3) {
				controller.getAction("update").excute();
			}else if (sel ==4) {
				controller.getAction("print").excute();
			}else if (sel ==5) {
				controller.getAction("save").excute();
			}else if (sel ==6) {
				controller.getAction("load").excute();
			}else if (sel ==0) {
				break;
			}
		}
	}
}
