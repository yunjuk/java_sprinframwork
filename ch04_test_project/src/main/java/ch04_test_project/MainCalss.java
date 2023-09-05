package ch04_test_project;

import java.util.Map;
import java.util.Set;

import ch04_test_project.AllMemberInfoView;
import ch04_test_project.Member;
import ch04_test_project.MemberDAO;
import ch04_test_project.MemberInfoView;
import ch04_test_project.MemberRegistrationView;
import ch04_test_project.MemberUpdateView;

public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//멤버 다오 객체 생성 
				MemberDAO memberDao = new MemberDAO();
				
				
				//멤버레지스트레이션뷰 객체 생성 // 등록 부분 
				MemberRegistrationView registrationView = new MemberRegistrationView();
				
				//회원 등록 예시
				Member mem1 = new Member();
				mem1.setId("김윤주");
				mem1.setPassword(1234);
				mem1.setPhoneNumber("010-8845-8991");
				mem1.setEmail("kkyyjj@naver.com");
				mem1.setNewMemsignIn("22-10-12");
				mem1.setLastModifyDate("22-10-14");
				
				
				//회원 정보 조회 예시
				MemberInfoView infoView = new MemberInfoView(memberDao);
				Member retrievedMember = infoView.select("김윤주"); // mem1 객체와 일치하는 ID를 전달
				if (retrievedMember != null) {
				    System.out.println("회원 정보 조회 결과: " + retrievedMember.getId() + ", " + retrievedMember.getEmail());
				} else {
				    System.out.println("회원 정보가 없습니다.");
				}
				
				//멤버 업데이트 뷰 객체 생성 
				MemberUpdateView updateView = new MemberUpdateView(memberDao);
				
				//회원정보 수정 예시 
				 Member updatedMember = new Member();
			        updatedMember.setId("user123");
			        updatedMember.setPassword(654321);
			        updatedMember.setEmail("newuser@example.com");
			        updateView.modify(updatedMember);
			
			   //올 멤버 인포 뷰 객체 생성 
			   AllMemberInfoView allInfoView = new AllMemberInfoView(memberDao);      
			   //모든 회원 정보 조회 예시 
			   Map<String, Member> allMembers = allInfoView.allSelect();
		       if (!allMembers.isEmpty()) {
		           System.out.println("모든 회원 정보:");
		           Set<String> memberIds = allMembers.keySet();
		           for (String memberId : memberIds) {
		               Member member = allMembers.get(memberId);
		               System.out.println("ID: " + member.getId() + ", Email: " + member.getEmail());
		           }
		       } else {
		           System.out.println("회원 정보가 없습니다.");
			   
					 
			}

			}
		
		
	}


