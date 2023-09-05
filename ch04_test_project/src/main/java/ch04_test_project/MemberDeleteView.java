package ch04_test_project;

import ch04_test_project.Member;
import ch04_test_project.MemberDAO;

public class MemberDeleteView {

	
	private MemberDAO memberDAO;

    public MemberDeleteView(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public void delete(String id) {
        if (verify(id)) {
            memberDAO.delete(id);
        } else {
            System.out.println("Member information is not available");
        }
    }

    private boolean verify(String id) {
        Member member = memberDAO.select(id);
        return member != null ? true : false;
    }
	
}
