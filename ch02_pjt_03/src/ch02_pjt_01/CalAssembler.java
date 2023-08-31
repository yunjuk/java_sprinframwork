package ch02_pjt_01;

public class CalAssembler {
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler() {
		//생성자가 가장 먼저 실행, 
		//마이 카큐레이터가 가장 먼저 생성 되고, 하나하나 밑에서 생기다가,
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		//에셈블러라는 메서드가 생기고, 
		assemble();
	}
	//여기서 자동으로 연산이 일어나게 됨. 여기 부분의 코드를 우리가 만든거라고 생각하면되고
	//메인 클래스가 스프링이라고 생각하면 됨. 
	public void assemble() {
		calculator.calculate(10, 5, calAdd);
		calculator.calculate(10, 5, calSub);
		calculator.calculate(10, 5, calMul);
		calculator.calculate(10, 5, calDiv);
	}
}
