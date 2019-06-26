package pack.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		ProcessInter inter = context.getBean("processImpl",ProcessInter.class);
		inter.selectDataAll();
		inter.selectDataCount();
		inter.selectDataEx1();
		inter.selectDataEx2();

	}

}
