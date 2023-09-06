package ch04_pjt_01.ems.utils;

import org.graalvm.compiler.lir.phases.GenericContext;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.service.PrintStudentInfomatonService;
import ch04_pjt_01.ems.member.service.StudentRegisterService;
import ch04_pjt_01.ems.member.service.StudentSelectService;

public class MainClassUserConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] appCtxs = {"classpath:appCtx1.xml",
							"classpath:appCtx2.xml",
							"classpath:appCtx3.xml"
		};
		
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(appCtxs);
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:appCtxImport.xml");
		
		
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		String[] sNums = initSampleData.getsNums();
		String[] sIds = initSampleData.getsIds();
		String[] sPws = initSampleData.getsPws();
		String[] sNames = initSampleData.getsNames();
		int[] sAges = initSampleData.getsAges();
		char[] sGenders = initSampleData.getsGenders();
		String[] sMajors = initSampleData.getsMajors();
		
		StudentRegisterService registerService = 
				ctx.getBean("studentRegisterService", StudentRegisterService.class);
		for (int i =0; i < sNums.length; i++) {
			registerService.register(new Student(sNums[i],sIds[i],sPws[i],sNames[i], sAges[i], sGenders[i], sMajors[i]));
		}
		PrintStudentInfomatonService printStudentInforamtionService = 
				ctx.getBean("printStudentInforamionService", printStudentInfomatonService.class);
			printStudentInforamtionService.printStudentsInfo();
			
			registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
			registerService.register(new Student("hbs006","deer","p0006","mellisa",26,'w',"Music"));
			
			printStudentInforamtionService.printStudentsInfo();
			
			StudentSelectService selectService = 
					ctx.getBean("studentSelectService", StudentSelectService.class);
			Student selectedStudent = selectService.select("hbs006");
			
			System.out.println("STUDENT STATR -----------------");
		
	}

}
