package com.xworkz.app.method.overload.override;

public class KrMarket extends Market {

	@Override
	public void buy() {
		System.out.println("invoking buy in KrMarket");
	}

}
