package _11콜렉션Member;

public class ActionFileSave implements Action{

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		MemberDAO memberDAO = MemberDAO.getInstance();
		if(memberDAO.isMemberListEmpty()) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		String name = Util.getStringVal("파일 이름을 입력하세요.")+".txt";
		memberDAO.memberListFileSave(name);
	}

}
