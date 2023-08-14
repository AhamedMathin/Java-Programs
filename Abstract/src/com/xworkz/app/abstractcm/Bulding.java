package com.xworkz.app.abstractcm;

public abstract  class Bulding {

		public abstract void water();

		public abstract void care();

		public abstract void work();

		public abstract void construct();

		public abstract void cost();

		public void guarding() {
			System.out.println("invoking guarding in buiding");
		}

		public void watering() {
			System.out.println("invoking watering in buiding ");
		}

		public void working() {
			System.out.println("invoking working in buiding");
		}

		public void caring() {
			System.out.println("invoking caring in buiding");
		}

		public void  growth() {
			System.out.println("invoking growth in buiding");
		

		}
}
