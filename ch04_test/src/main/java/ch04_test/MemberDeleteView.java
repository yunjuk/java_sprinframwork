package ch04_test;

import ch04_test.MemberDeleteView;

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