package ch03_pjt_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
	Hello hello = 
				ctx.getBean("hello",Hello.class);
	//bean 연결해줌 
		hello.sayHello();
		hello.selectHello();
		
		ctx.close();
		
	}

}
