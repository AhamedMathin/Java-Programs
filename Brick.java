class Brick{
	
	static String brand;
	static String type;
	String color;
	double price;
	
	Brick(String color,double price)
	{
		System.out.println("Invoking String price constructor in Brick");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="NSP Bricks";
		type="Hard";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Brick");
		System.out.println("The brand of Brick is "+brand);
		System.out.println("Type of Brick is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Brick ");
		System.out.println("Color of Brick is "+this.color);
		System.out.println("Price of Brick is "+this.price);
	}
}