package configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.MemberController;
import dao.MemberDAO;
import utils.InitSampleData;
import view.MemberViewer;

@Configuration
public class MemberConfig {

	@Bean
	public MemberViewer memberViewer() {
		return new MemberViewer();
	}
	
	
	@Bean
	public MemberDAO memberDAO() {
		return new MemberDAO();
	}
	
	@Bean 
	public MemberController memberController() {
		MemberDAO memberDAO = new MemberDAO();
		MemberViewer memberViewer = new MemberViewer();
		MemberController memberController = MemberController(memberDAO(), memberViewer());
		return memberController;
	}
	
	
	@Bean
	public InitSampleData initSampleData() {
		InitSampleData initSampleData = new InitSampleData();
		String[] ids= {"hbs001","hbs002","hbs003"};
		initSampleData.setIds(ids);
		
		String[] password= {"hbs001","hbs002","hbs003"};
		String[] contact= {"hbs001","hbs002","hbs003"};
		String[] emails= {"hbs001","hbs002","hbs003"};
		String[] registeredDates= {"hbs001","hbs002","hbs003"};
		String[] modifiedDates= {"hbs001","hbs002","hbs003"};
		initSampleData.setPasswords(password);
		initSampleData.setContacts(contact);
		initSampleData.setEmails(emails);
		initSampleData.setRegisteredDates(registeredDates);
		initSampleData.setModifiedDates(modifiedDates);
		
		return initSampleData;
		
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	private MemberController MemberController(MemberDAO memberDAO, MemberViewer memberViewer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
