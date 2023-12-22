package _11콜렉션Member;

public class ActionDelete implements Action{

	@Override
	public void excute() {
		MemberDAO memberDAO = MemberDAO.getInstance();
		if(memberDAO.isMemberListEmpty()) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		while(true) {
			String id = Util.getStringVal("아이디 입력 >>");
			Member m = null;
			if(!memberDAO.isDupId(id)) {
				System.out.println("아이디 를 찾을 수 없음");
				continue;
			}
			memberDAO.deleteMemberById(id);
			break;
		}
		// TODO Auto-generated method stub
		//멤버 추가하는 페이지
	}
}
