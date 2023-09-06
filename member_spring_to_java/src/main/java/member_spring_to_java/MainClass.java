package member_spring_to_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import configration.MemberConfig;
import controller.MemberController;
import dao.MemberDO;
import utils.InitSampleData;


public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig.class);
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] ids= initSampleData.getIds();
		String[] passwords= initSampleData.getPasswords();
		String[] contacts= initSampleData.getContacts();
		String[] emails= initSampleData.getEmails();
		String[] registeredDates= initSampleData.getRegisteredDates();
		String[] modifiedDates = initSampleData.getModifiedDates();
		
		MemberController mc = 
				ctx.getBean("memberController", MemberController.class);
		for(int i = 0 ; i < ids.length ; i++) {
			mc.insert(new MemberDO(ids[i],passwords[i],contacts[i],emails[i],registeredDates[i],modifiedDates[i]));
		}
		
		mc.showAllMembers();
		
		ctx.close();
	}

}
