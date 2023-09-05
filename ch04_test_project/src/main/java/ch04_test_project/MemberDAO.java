package ch04_test_project;

import java.util.HashMap;
import java.util.Map;

import ch04_test_project.Member;

public class MemberDAO {

	
	private Map<String, Member> memberDB = new HashMap<String, Member> ();
	
	public void insert(Member member) {
		memberDB.put(member.getId(),member);
	}
	
	public Member select(String Id) {
		return memberDB.get(Id);
	}
	
	public void update(Member member) {
		memberDB.put(member.getId(), member);
	}
	
	public void delete(String Id) {
		memberDB.remove(Id);
	}
	
	public Map<String, Member>getMemberDB(){
		return memberDB;
	}




}
