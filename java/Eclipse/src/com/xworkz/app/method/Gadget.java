package com.xworkz.app.method;

public class Gadget {
	public int speed;
	public String cameraQuality;

	public void use() {
		System.out.println("invoking no-arg method use of Gadget");
		use(50);
		use("16MP");
		}

	public void use(String cameraQuality) {
		System.out.println("invoking String use of Gadget ");
		System.out.println("CameraQuality:" +cameraQuality);
	}

	public void use(int speed) {
		System.out.println("invoking int use of Gadget");
		System.out.println("Speed:" + speed);
	}

	public void use(String cameraQuality, int speed) {
		System.out.println("invoking String,int use of Gadget");
		use(cameraQuality);
		use(speed);
	}

}
