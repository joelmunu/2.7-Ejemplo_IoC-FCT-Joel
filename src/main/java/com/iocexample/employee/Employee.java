package com.iocexample.employee;

public class Employee implements IEmployee {

	@Override
	public void onDuty() {
		System.out.println("Ahora el empleado esta trabajando");
	}

	@Override
	public void offDuty() {
		System.out.println("El empleado ha salido de servicio");
	}
}
