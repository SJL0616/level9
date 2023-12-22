package _11콜렉션Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberDAO {

	private MemberDAO() {
		init();
	};

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private ArrayList<Member> memberList;

	private void init() {
		memberList = new ArrayList<Member>();
	}

	public void insertMember(String id , String pw) {
		
		memberList.add(new Member(id, pw));
		System.out.println(id + "님의 정보가 저장되었습니다.");
	}

	public void deleteMemberById(String id) {
		Member member = getMemberById(id);
		memberList.remove(member);
		System.out.println(id + "님의 정보가 삭제되었습니다.");
	}

	public void updateMemberPw(String id, String pw) {
		Member member = getMemberById(id);
		member.setPw(pw);
		System.out.println(id + "님의 비밀번호가 수정되었습니다.");
	}

	public void printMemberList() {
		
		for (Member m : getListOrderById()) {
			System.out.println(m);
		}
	}

	public boolean isMemberListEmpty() {
		return memberList.size() == 0 ? true : false;
	}

	public boolean isDupId(String id) {
		return getMemberById(id) != null ? true : false;
	}
	
	private ArrayList<Member> getListOrderById(){
		ArrayList<Member> temp = memberList;
		Collections.sort(temp);
		return temp;
	}
	
	private Member getMemberById(String id) {
		for (Member m : memberList) {
			if (m.getId().equals(id)) {
				return m;
			}
		}
		return null;
	}
	
	public void memberListFileSave(String fileName) {
		String data ="";
		int idx= 0 ;
		for(Member m : getListOrderById()) {
			if(idx != memberList.size()-1) {
				data += m.getId()+"/"+m.getPw()+"\n";
			}else {
				data += m.getId()+"/"+m.getPw();
			}
			
			idx++;
		
		}
		
		Util.FileSave(fileName,data);
		
	}
	
	public void memberListFileLoad() {
		Util.FileLoad();
	}
}
