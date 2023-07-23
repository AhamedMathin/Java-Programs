class MainMethod{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Main");
		
		Helmet h1=new Helmet("Black",800);
		h1.printStatic();
		h1.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Bureau b1=new Bureau("Brown",8000);
		b1.printStatic();
		b1.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Candle c1=new Candle("White",25);
		c1.printStatic();
		c1.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Brick b2=new Brick("Red",30);
		b2.printStatic();
		b2.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Soil s1=new Soil("Red",30);
		s1.printStatic();
		s1.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Power p1=new Power("Manglore",100);
		p1.printStatic();
		p1.printInstance();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Butterfly butterfly=new Butterfly("Orange","Viceroy");
		butterfly.printStatic();
		butterfly.printInstance();
	
	}
	
}