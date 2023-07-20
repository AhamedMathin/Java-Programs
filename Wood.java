class Wood{
	String name;
	String type;
	double price;
	String color;
	double  weightInGrams;
	
	Wood(String name)
	{	
		System.out.println("invoking String constructor in wood");
		this.name=name;	
	}
	Wood(String name,String type)
	{
		System.out.println("invoking String,Stirng constructor in wood");
		this.name=name;
		this.type=type;		
	}
	Wood(String name,String type,double price)
	{
		this(name,type);
		this.price=price;
		System.out.println("invoking String,Stirng,double constructor in wood");
	}
	
	Wood(String name,String type,double price,String color)
	{
		this(name,type,price);
		this.color=color;
		System.out.println("invoking String,Stirng,double,String constructor in wood");	
	}
	Wood(String name,String type,double price,String color,double weightInGrams)
	{
		this(name,type,price,color);
		this.weightInGrams=weightInGrams;
		System.out.println("invoking String,Stirng,double,String,double constructor in wood");	
	}
	
}