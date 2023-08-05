package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.inheritance.LoalLAN;
import com.xworkz.app.inheritance.Router;

public class RouterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RouterRunner");
		 Router router =new Router();
		 System.out.println(router.name);
		 System.out.println(router.ports);
		 System.out.println(router.connectivity);
		 System.out.println(router.price);
		 
		 
		 LoalLAN loalLAN=new LoalLAN();
		 System.out.println(loalLAN.name);
		 System.out.println(loalLAN.ports);
		 System.out.println(loalLAN.connectivity);
		 System.out.println(loalLAN.price);
	}

}
