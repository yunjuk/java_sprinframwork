package ch04_test;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

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
