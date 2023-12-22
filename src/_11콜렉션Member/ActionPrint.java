package _11콜렉션Member;

public class ActionPrint implements Action{

	@Override
	public void excute() {
		MemberDAO memberDAO = MemberDAO.getInstance();
		if(memberDAO.isMemberListEmpty()) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		memberDAO.printMemberList();
		// TODO Auto-generated method stub
		//멤버 추가하는 페이지
	}
}
