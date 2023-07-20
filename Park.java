class Park{
	String parkName;
	double boundary;
	String type;
	int noOfBenchs;
	String maintenance;
	boolean parking;
	boolean equipment;
	boolean playGround;
	boolean walkingPath;
	
	
	Park(String parkName)
	{	
		System.out.println("invoking String constructor in Park");
		this.parkName=parkName;	
	}
	Park(String parkName,double boundary)
	{	
		System.out.println("invoking String,double constructor in Park");
		this.parkName=parkName;
        this.boundary=boundary;		
	}
	Park(String parkName,double boundary,String type)
	{	
	    this(parkName,boundary);
		this.type=type;
		System.out.println("invoking String,double,String constructor in Park");
	}
	Park(String parkName,double boundary,String type,int noOfBenchs)
	{	
	    this(parkName,boundary,type);
		this.noOfBenchs=noOfBenchs;
		System.out.println("invoking String,double,String,int constructor in Park");
	}
	
	
	Park(String parkName,double boundary,String type,int noOfBenchs,String maintenance)
	{	
	    this(parkName,boundary,type);
		this.maintenance=maintenance;
		System.out.println("invoking String,double,String,int,String constructor in Park");
	}
	Park(String parkName,double boundary,String type,int noOfBenchs,String maintenance,boolean parking)
	{	
	    this(parkName,boundary,type,noOfBenchs,maintenance);
		this.parking=parking;
		System.out.println("invoking String,double,String,int,boolean constructor in Park");
	}
	Park(String parkName,double boundary,String type,int noOfBenchs,String maintenance,boolean parking,boolean equipment)
	{	
	    this(parkName,boundary,type,noOfBenchs,maintenance,parking);
		this.equipment=equipment;
		System.out.println("invoking String,double,String,int,boolean,boolean constructor in Park");
	}
	Park(String parkName,double boundary,String type,int noOfBenchs,String maintenance,boolean parking,boolean equipment,boolean playGround)
	{	
	    this(parkName,boundary,type,noOfBenchs,maintenance,parking,equipment);
		this.playGround=playGround;
		System.out.println("invoking String,double,String,int,boolean,boolean,boolean constructor in Park");
	}
	Park(String parkName,double boundary,String type,int noOfBenchs,String maintenance,boolean parking,boolean equipment,boolean playGround,boolean walkingPath)
	{	
	    this(parkName,boundary,type,noOfBenchs,maintenance,parking,equipment,playGround);
		this.walkingPath=walkingPath;
		System.out.println("invoking String,double,String,int,boolean,boolean,boolean,boolean constructor in Park");
	}
	
	
	
}