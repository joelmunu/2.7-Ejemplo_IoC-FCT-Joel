package com.iocexample.employee;

public class Ceo implements IEmployee {

	@Override
	public void onDuty() {
		System.out.println("Ahora el CEO esta trabajando");
	}

	@Override
	public void offDuty() {
		System.out.println("El CEO ha salido de servicio");
	}
}
