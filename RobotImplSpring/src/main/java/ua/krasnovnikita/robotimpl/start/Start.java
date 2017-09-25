package ua.krasnovnikita.robotimpl.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.krasnovnikita.robotimpl.robot.ModelT100;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ModelT100 modelT100 = (ModelT100) context.getBean("t100");
		// System.out.println(modelT100);
		// modelT100.dance();
		// modelT100.action();
		// ModelT100 modelT100Empty = (ModelT100) context.getBean("t100Empty");
		// modelT100Empty.action();
		// ModelT100 modelT100Other = (ModelT100) context.getBean("t100");
		// System.out.println(modelT100Other.getHand());

	}

}
