package ch04_test_project;

import ch04_test_project.Member;
import ch04_test_project.MemberDAO;

public class MemberUpdateView {

	
private MemberDAO memberDao;
	
	public MemberUpdateView(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void modify(Member member) {
		if(verify(member.getId())) {
			memberDao.update(member);
		}else {
			System.out.println("Member information is available");
		}
	}

	private boolean verify(String Id) {
		// TODO Auto-generated method stub
		Member member = memberDao.select(Id);
		return member != null? true : false;
	}
}
