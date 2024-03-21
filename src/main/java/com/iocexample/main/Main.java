package com.iocexample.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.iocexample.factory.Factory;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory beanFactory = context;
		System.out.println("--- Reporte de trabajo del día ---");
		Factory factory = (Factory) beanFactory.getBean("factory");
		factory.getOnDuty();
		factory.getOffDuty();

		context.close();
	}
}