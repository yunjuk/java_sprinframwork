package ch04_test_project;

import ch04_test_project.Member;
import ch04_test_project.MemberDAO;

public class MemberInfoView {

	
	
private MemberDAO memberDao;
	
	public MemberInfoView(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public Member select(String Id) {
		if(verify (Id)) {
			return memberDao.select(Id);
		}else {
			System.out.println("Member information is available.");
		}
		return null;
	}

	private boolean verify(String Id) {
		// TODO Auto-generated method stub
		Member member = memberDao.select(Id);
		return member != null ? true : false;
	}
}
