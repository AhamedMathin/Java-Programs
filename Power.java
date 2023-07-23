class Power{
	
	static String brand;
	static String type;
	String location;
	double price;
	
	Power(String location,double price)
	{
		System.out.println("Invoking String,double  constructor in Power");
		this.location=location;
		this.price=price;
	}
	
	static{
		brand="Just Energy";
		type="Formal";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Power");
		System.out.println("The brand of Power is "+brand);
		System.out.println("Type of Power is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Power ");
		System.out.println("Color of Power is "+this.location);
		System.out.println("Price of Power is "+this.price);
	}
}