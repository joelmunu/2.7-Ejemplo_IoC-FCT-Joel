package com.iocexample.main;

import com.iocexample.employee.Employee;
import com.iocexample.employee.Ceo;
import com.iocexample.factory.Factory;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Reporte de trabajo del CEO ---");
		Factory factory = new Factory(new Ceo());
		factory.getOnDuty();
		factory.getOffDuty();
		System.out.println("\n");
		System.out.println("--- Reporte de trabajo de los empleados ---");
		Factory employeeFactory = new Factory(new Employee());
		employeeFactory.getOnDuty();
		employeeFactory.getOffDuty();
	}

}
