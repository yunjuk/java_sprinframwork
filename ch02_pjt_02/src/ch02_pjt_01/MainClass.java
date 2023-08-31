package ch02_pjt_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalulator calculator = new MyCalulator();
		calculator.calculate(10,5, new CalAdd());
		calculator.calculate(10,5, new CalSub());
		calculator.calculate(10,5, new CalMul());
		calculator.calculate(10,5, new CalDiv());

		
		
	}

}
