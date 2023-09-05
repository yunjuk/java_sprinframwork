package ch04_test_project;

import java.util.Map;

public class AllMemberInfoView {

	
	
	private MemberDAO memberDao;
		
		public AllMemberInfoView(MemberDAO memberDao) {
			this.memberDao = memberDao;
		}
		
		public Map<String, Member> allSelect(){
			return memberDao.getMemberDB();
			}
	}


