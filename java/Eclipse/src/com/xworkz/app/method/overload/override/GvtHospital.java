package com.xworkz.app.method.overload.override;

public class GvtHospital extends Hospital {
	
	@Override
	public void visit(String name) {
		
		System.out.println("invoking  String visit in GvtHospital");
	}
	@Override
	public void visit() {
		
		System.out.println("invoking visit in GvtHospital");
	}
	

}
