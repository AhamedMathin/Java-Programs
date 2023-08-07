package com.xworkz.app.method;

public class Pillar {
	public int type;
	public String diffKinds;

	public void build() {
		System.out.println("invoking no-arg method build in Pillar");
		build(3);
		build("Doric Column");
	}

	public void build(int type) {
		System.out.println("invoking int build in Pillar ");
		System.out.println("Type:" + type);
	}

	public void build(String diffKinds) {
		System.out.println("invoking String build in Pillar");
		System.out.println("Different Kinds:" + diffKinds);
	}

	public void build(String diffKinds, int type) {
		System.out.println("invoking int,String  build in Pillar");
		build(type);
		build(diffKinds);
	}
}
