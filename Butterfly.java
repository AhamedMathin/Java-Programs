class Butterfly{
	
	static String personalities;
	static int noOfLegs;
	String color;
	String name;
	
	Butterfly(String color,String name)
	{
		System.out.println("Invoking String  constructor in Butterfly");
		this.color=color;
		this.name=name;
	}
	
	static{
		personalities="gentle and loving souls";
		noOfLegs=6;
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Butterfly");
		System.out.println("The personalities of Butterfly is "+personalities);
		System.out.println("legs of Butterfly is "+noOfLegs);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Butterfly ");
		System.out.println("Color of Butterfly is "+this.color);
		System.out.println("Name of Butterfly is "+this.name);
	}
}