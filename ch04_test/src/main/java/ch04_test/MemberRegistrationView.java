package ch04_test;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

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
