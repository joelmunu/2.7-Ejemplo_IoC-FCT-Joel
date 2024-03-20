package com.iocexample.factory;

import com.iocexample.employee.IEmployee;

public class Factory {
	IEmployee employee;

	public Factory(IEmployee employee) {
		this.employee = employee;
	}
	
	public void getOnDuty() {
		employee.onDuty();
	}
	
	public void getOffDuty() {
		employee.offDuty();
	}
}
