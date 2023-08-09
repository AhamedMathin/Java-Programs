package com.xworkz.app.method.overload.override;

public class OldHostel extends Hostel{
	
	@Override
	public void leave() {
		System.out.println("invoking leave in OldHostel");
	}

}
