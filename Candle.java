class Candle{
	
	static String brand;
	static String type;
	String color;
	double price;
	
	Candle(String color,double price)
	{
		System.out.println("Invoking String price constructor in Candle");
		this.color=color;
		this.price=price;
	}
	
	static{
		brand="Vita";
		type="Hard";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Candle");
		System.out.println("The brand of Candle is "+brand);
		System.out.println("Type of Candle is "+type);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Candle ");
		System.out.println("Color of Candle is "+this.color);
		System.out.println("Price of Candle is "+this.price);
	}
}