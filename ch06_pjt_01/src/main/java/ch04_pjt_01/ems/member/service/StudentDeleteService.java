package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDAO;

public class StudentDeleteService {

	
	private StudentDAO studentDao;
	
	
	public StudentDeleteService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	public void delete(String sNum) {
		if (verity(sNum)) {
			studentDao.delete(sNum);
		}else {
			System.out.println("Student information is available");
		}
	}
	private boolean verity(String sNum) {
		// TODO Auto-generated method stub
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}
	
	
}
