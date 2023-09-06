package ch04_pjt_01.ems.member.service;
import ch04_pjt_01.ems.member.dao.StudentDAO;
import ch04_pjt_01.ems.member.Student;

public class StudentRegisterService {

	
	private StudentDAO studentDao;
	
	public StudentRegisterService(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		}else {
			System.out.println("The student has alreay registered.");
		}
	}

	private boolean verify(String sNum) {
		// TODO Auto-generated method stub
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}

	}
	

