package ch04_test_project;

import ch04_test_project.Member;
import ch04_test_project.MemberDAO;

public class MemberRegistrationView {

	
	
private MemberDAO memberDao;
	
	public MemberRegistrationView () {
		this.memberDao = memberDao;
	}
	
	public void register(Member member) {
		if(verify(member.getId())) {
			memberDao.insert(member);
		}else {
			System.out.println("The member has alreay registered.");
		}
	}

	private boolean verify(String Id) {
		// TODO Auto-generated method stub
		Member member = memberDao.select(Id);
		return member == null ? true : false;
	}
}
