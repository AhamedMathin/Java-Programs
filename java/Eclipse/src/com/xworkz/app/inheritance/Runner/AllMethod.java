package com.xworkz.app.inheritance.Runner;

import com.xworkz.app.method.Amobea;
import com.xworkz.app.method.AmobeaProtecus;
import com.xworkz.app.method.Band;
import com.xworkz.app.method.Bangle;
import com.xworkz.app.method.BestCoal;
import com.xworkz.app.method.Coal;
import com.xworkz.app.method.Dinosaur;
import com.xworkz.app.method.Drum;
import com.xworkz.app.method.ExtintDinosaur;
import com.xworkz.app.method.Flex;
import com.xworkz.app.method.Gate;
import com.xworkz.app.method.GoldBangle;
import com.xworkz.app.method.GoldClass;
import com.xworkz.app.method.LargeFlex;
import com.xworkz.app.method.MallTheater;
import com.xworkz.app.method.Mic;
import com.xworkz.app.method.Speaker;
import com.xworkz.app.method.Theater;
import com.xworkz.app.method.Ticket;
import com.xworkz.app.method.WoodGate;

public class AllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in AllMethod");
		Coal coal = new BestCoal();
		coal.burn();

		System.out.println("########################################");
		Amobea amobea = new AmobeaProtecus();
		amobea.shape();

		System.out.println("########################################");
		Bangle bangle = new GoldBangle();
		bangle.broken();

		System.out.println("########################################");
		Gate gate = new WoodGate();
		gate.sound();

		System.out.println("########################################");
		Dinosaur dinosaur = new ExtintDinosaur();
		dinosaur.eat();

		System.out.println("########################################");
		Flex flex = new LargeFlex();
		flex.stick();

		System.out.println("########################################");
		Mic mic = new Speaker();
		mic.speak();

		System.out.println("########################################");
		Drum drum = new Band();
		drum.noise();

		System.out.println("########################################");
		Theater theater = new MallTheater();
		theater.watch();

		System.out.println("########################################");
		Ticket ticket = new GoldClass();
		ticket.buy();

	}

}
