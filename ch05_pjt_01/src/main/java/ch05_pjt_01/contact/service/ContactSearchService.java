package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.dao.ContactDAO;
import ch05_pjt_01_.ContactSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ContactSearchService {

	
	@Autowired
	@Qualifier("usedDao")
	private ContactDAO contactDao;
//	
//	public ContactSearchService() {
//		System.out.println("default constructor");
//	} // 생성자 부분이 없어도, 정상적으로 실행이 됨. 
	
//	@Autowired
//	public ContactSearchService(ContactDAO contactDao) {
//		System.out.println("contactDao:" +contactDao);
//		this.contactDao = contactDao;
//	}
	
	@Autowired
	public void setContactDAO(ContactDAO contactDao) {
		this.contactDao= contactDao;
	}
	
	
	public ContactSet searchContact(String name) {
		
		if(verify(name)) {
			return contactDao.select(name);
		}else {
			System.out.println("Contact informaation is available");
		}
		
		
		return null;
		
	}

	private boolean verify(String name) {
		// TODO Auto-generated method stub
		ContactSet contactSet = contactDao.select(name);
		return contactSet != null? true : false;
	} 
	public void setContactDao(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}
	
	
}
