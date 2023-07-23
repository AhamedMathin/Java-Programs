class Soil{
	
	static String brand;
	static String type;
	String color;
	double price;
	
	Soil(String color,double price)
	{
		System.out.println("Invoking String price constructor in Soil");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="Utkarsh Agrochem";
		type="clay";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Soil");
		System.out.println("The brand of Soil is "+brand);
		System.out.println("Type of Soil is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Soil ");
		System.out.println("Color of Soil is "+this.color);
		System.out.println("Price of Soil is "+this.price);
	}
}