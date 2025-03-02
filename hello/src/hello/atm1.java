 package hello;
import java.util.Scanner;

interface account{
	
	void debit();
	void credit();
	void currentbalance();
}

 class sbi implements account
 {
	 int amount=50000;
	 Scanner scan=new Scanner(System.in);
	
	public void debit()
	{
		
		System.out.println("enter your debit amount");
		int a=scan.nextInt();
	//	amount=amount-a;
		
		if(amount-a==0 || amount-a<500 )
		{
			System.out.println("you have minimum maintain 500");
		}
		 if(amount-a>=500)
	{
			amount=amount-a;
			
		}
		currentbalance();
	}
	public void credit()
	
	{   
		System.out.println("enter your credit amount");
		int a=scan.nextInt();
		amount=amount+a;	
		currentbalance();
		System.out.println("YOUR TRANSANTION HAS BEEN SUCCESSFULLY COMPLETED👍👍👍😃😃😃");
	}
	public void currentbalance()
	{
		System.out.println("currnt balance "
				+"\n"+ amount  );
		System.out.println("  CONTINUE PROCESS MEANS RE ENTER YOUR PIN ");
	}
	
	
	}
class iob{
	 int amount=50000;
	 Scanner scan=new Scanner(System.in);
	public void debit()
	{
	System.out.println("enter your debit amount");
	int a=scan.nextInt();
//	amount=amount-a;
	
	if(amount-a==0 || amount-a<500 )
	{
		System.out.println("you have minimum maintain 500");
	}
	 if(amount-a>=500)
{
		amount=amount-a;
		
	}
	currentbalance();
}
public void credit()
{   
	System.out.println("enter your credit amount");
	int a=scan.nextInt();
	amount=amount+a;	
	currentbalance();
	System.out.println("YOUR TRANSANTION HAS BEEN SUCCESSFULLY COMPLETED👍👍👍😃😃😃");
}
public void currentbalance()
{
	System.out.println("currnt balance "
			+"\n"+ amount  );
}

	
}

public class atm1 {
       
       public static void main(String[] args) {
		
    	   Scanner scan=new Scanner(System.in);
    	   sbi sbi1=new sbi();
    	   iob iob1=new iob();
		
	    boolean bb=true;
	      while(bb)
      {	
	    	  System.out.println( "\nchoose your bank  "
	  				+ "\n1.sbi\n2.iob\n3.exit");
	    	  int b=scan.nextInt();
	    	 
	    	  switch(b)
		 {
	    	  
		 case 1://SBI
			 System.out.println(" your choosed sbi\nEntre yor PIN");
			
			 while(true) 
			 {
				 
				 b=scan.nextInt();
					if(b==54321)
					{
						System.out.println("you entered correct pin");
					
			System.out.println(" YOU SELECTED SBI\n1.debit\n2.credit\n3.check balance\n4.exit");
			
			 
			 b=scan.nextInt();
			 if(b==1)
			 { 
				sbi1.debit();
			 }
			 else if(b==2)
			 {
				 sbi1.credit();				 
			 }	
			 else if(b==3)
			 {
				 sbi1.currentbalance();
			 }
			 else {
				break;			 
			      }
			 }
			 
			 else {
				 System.out.println("try again");
			 }
		 
	 }
			 
         break;
		 
		 case 2://IOB
			 System.out.println("Entre yor PIN");
			 while(true) 
			 {
				 
				 b=scan.nextInt();
					if(b==54321)
					{
						System.out.println("you entered correct pin");
					
			
			System.out.println(" YOU SELECTED IOB\n1.debit\n2.credit\n3.check balance\n4.exit");
			 b=scan.nextInt();
			 if(b==1)
			 { 
				iob1.debit();
			 }
			 else if(b==2)
			 {
				 iob1.credit();				 
			 }	
			 else if(b==3)
			 {
				iob1.currentbalance();
			 }                                                                                                                                                                           
			 else {
				
				 break;			 
			 }
			 }
					else 
					{
						
					System.out.println("try again");

					}
			 }
			 
		 case 3:{//EXIT
			 bb=false;
		 }
			 }
//			 
//			if(b==3) {
//				
//			}
//			else {
//				bb=false;
//			}
		 }
	}
  }

