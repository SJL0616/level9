package _11콜렉션Member;

public class ActionInsert implements Action{

	@Override
	public void excute() {
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		while(true) {
			String id = Util.getStringVal("아이디 입력 >>");
			if( memberDAO.isDupId(id)) {
				System.out.println("아이디 중복");
				continue;
			}
			String pw = Util.getStringVal("비밀번호 입력 >>");
			
			memberDAO.insertMember(id, pw);
			break;
		}
		// TODO Auto-generated method stub
		//멤버 추가하는 페이지
	}
}
