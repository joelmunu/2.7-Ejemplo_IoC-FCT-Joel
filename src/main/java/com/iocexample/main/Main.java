package com.iocexample.main;

import com.iocexample.employee.Employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iocexample.employee.Ceo;
import com.iocexample.factory.Factory;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory beanFactory = context;
		Factory factory = (Factory) beanFactory.getBean("factory");
		factory.getOnDuty();
		factory.getOffDuty();
	}

}
