package ch02_pjt_01;

public class MyCalulator {

	public void calculate(int fNum, int sNum, ICalculator calculator) {
		 //외부에서 주입받을수 있도록, 코드 수정
		//외부 클래스에서 이걸 실행할때, 본인이 직접 해당 외부 객체 맞는 것을 생성해서 실행함. 
		//해당 외부 클래스에 맞는 두오퍼레이션을 실행함. 
		//저기 맨위 매개변수 자리에서 외부 객체에 맞는 것 생성하는 거임
		int value = calculator.doOPeration(fNum, sNum);
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
