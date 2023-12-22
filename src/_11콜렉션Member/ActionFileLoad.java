package _11콜렉션Member;

public class ActionFileLoad implements Action{

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		MemberDAO memberDAO = MemberDAO.getInstance();
		memberDAO.memberListFileLoad();
	}

}
