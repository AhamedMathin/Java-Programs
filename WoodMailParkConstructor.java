class WoodMailParkConstructor{
	public static void main(String[] args)
	{
	System.out.println("invoking main method ");
	 
	Wood wood=new Wood("Oak");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	Wood wood1=new Wood("Teak","SoftWood",4500);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	Wood wood2=new Wood("Pine","Hardwood",5000,"yellow",1000);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	
	Mail mail=new Mail("Manager");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	Mail mail1=new Mail("Manager","employee");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	Mail mail2=new Mail("Manager","employee","ProjectMail",true,"Deadline of project",true,"viewed");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	
	Park park=new Park();
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	
	
	}
}