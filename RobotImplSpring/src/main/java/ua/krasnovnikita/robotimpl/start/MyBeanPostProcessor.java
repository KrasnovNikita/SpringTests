package ua.krasnovnikita.robotimpl.start;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Bean " + arg1 + " created: " + arg0.toString());
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Bean " + arg1 + " before initialization: " + arg0.toString());

		return arg0;
	}

}
