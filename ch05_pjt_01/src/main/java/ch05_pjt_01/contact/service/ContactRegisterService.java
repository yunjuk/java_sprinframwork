package ch05_pjt_01.contact.service;

import ch05_pjt_01_.ContactSet;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ch05_pjt_01.contact.dao.ContactDAO;


public class ContactRegisterService {
	
	@Autowired
	@Qualifier("usedDao")
	private ContactDAO  contactDao;
//	@Resource //설명 이후 쓰지 않음. 이거 써도되긴 하는데, 그래도 그냥 안쓰겠음. 
	
//	public ContactRegisterService() {
//		System.out.println("default constructor");
//	}//생성자 부분도 주석처리 해줘도 정상 실행이 된다. 
	
//	@Autowired
//	public ContactRegisterService(ContactDAO contactDao) {
//		System.out.println("contactDao:"+contactDao);
//		this.contactDao = contactDao;
//	}

	@Autowired
	public void setContactDAO(ContactDAO contactDao) {
		this.contactDao= contactDao;
	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if(verify(name)) {
			contactDao.insert(contactSet);
		}else {
			System.out.println("The name has already registered");
		}
	}
	public boolean verify(String name) {
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null? true:false;
	}
	public void setContactDao(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
}
