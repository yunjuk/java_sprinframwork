package ch02_pjt_01;

public class MyCalulator {
	ICalculator ic;
	public void calculate(int fNum, int sNum, char operator) {
	switch(operator){
	case '+' : 
		ic = new CalAdd();
		break;
	case '-' : 
		ic = new CalSub();
		break;
	case '*' : 
		ic = new CalMul();
		break;
	case '/' : 
		ic = new CalDiv();
		break;
	case '%' : 
		ic = new CalMod();
		break;
	}

		
		int value = ic.doOPeration(fNum, sNum);
		System.out.println("result :"+value);
	}
}
	
//	public void calSub(int fNum, int sNum, CalSub calSub) {
////		ICalculator calculator = new CalSub();  생성자 지워줌 
//		int value = calSub.doOPeration(fNum, sNum);
//		System.out.println("result :"+value);
//	}
//	public void calMul(int fNum, int sNum, CalMul calMul) {
//		
//		int value = calMul.doOPeration(fNum, sNum);
//		System.out.println("result :"+value);
//	}
//	public void calDiv(int fNum, int sNum, CalDiv calDiv) {
//		
//		int value = calDiv.doOPeration(fNum, sNum);
//		System.out.println("result :"+value);
//	}
//	
//}
