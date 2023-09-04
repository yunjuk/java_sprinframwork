package ch04_test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;





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
