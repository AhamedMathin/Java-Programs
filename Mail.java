class Mail{
	String senderName;
	String receiverName;
	String type;
	String reason;
	boolean meassageSent;
	boolean secure;
	String view;
	
	
	Mail(String senderName)
	{	
		System.out.println("invoking String constructor in Mail");
		this.senderName=senderName;	
	}
	Mail(String senderName,String receiverName)
	{
		System.out.println("invoking String,Stirng constructor in Mail");
		this.senderName=senderName;
		this.receiverName=receiverName;		
	}
	Mail(String senderName,String receiverName,String type)
	{
		this(senderName,receiverName);
		this.type=type;
		System.out.println("invoking String,Stirng,String constructor in Mail");
	}
	
	Mail(String senderName,String receiverName,String type,boolean meassageSent)
	{
		this(senderName,receiverName,type);
		this.meassageSent=meassageSent;
		System.out.println("invoking String,Stirng,String,boolean constructor Mail");	
	}
    Mail(String senderName,String receiverName,String type,boolean meassageSent,String reason)
	{
		this(senderName,receiverName,type,meassageSent);
		this.reason=reason;
		System.out.println("invoking String,Stirng,String,boolean,String constructor Mail");	
	}
	Mail(String senderName,String receiverName,String type,boolean meassageSent,String reason,boolean secure)
	{
		this(senderName,receiverName,type,meassageSent,reason);
		this.secure=secure;
		System.out.println("invoking String,Stirng,String,boolean,String,boolean constructor Mail");	
	}
	Mail(String senderName,String receiverName,String type,boolean meassageSent,String reason,boolean secure,String view)
	{
		this(senderName,receiverName,type,meassageSent,reason,secure);
		this.view=view;
		System.out.println("invoking String,Stirng,String,boolean,String,boolean,Stirng constructor Mail");	
	}
}