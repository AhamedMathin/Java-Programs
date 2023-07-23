class Bureau{
	
	static String brand;
	static String type;
	String color;
	double price;
	
	Bureau(String color,double price)
	{
		System.out.println("Invoking String price constructor in Bureau");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="Branding Nerd";
		type="Smooth";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Bureau");
		System.out.println("The brand of Bureau is "+brand);
		System.out.println("Type of Bureau is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Bureau ");
		System.out.println("Color of Bureau is "+this.color);
		System.out.println("Price of Bureau is "+this.price);
	}
}