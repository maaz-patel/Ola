package Ola.com;
import java.util.Scanner;
public class oladrive 
{
	ola a;
	static Scanner sc=new Scanner(System.in);
	
	public void makeride()
	{
		System.out.println("1.mini 2.prime 3.sweden");
		switch(sc.nextInt())
		{
		case 1:
		{		System.out.println("enter starting point");
				String from=sc.next();
				System.out.println("enter the ending point");
				String to=sc.next();
				System.out.println("enter km");
				int km=sc.nextInt();
				
		    	a=new mini(from,to,km);
		    	System.out.println("please wait cab is coming");
		    	break;
		}
		    	
		case 2:
		{	System.out.println("enter starting point");
			String from=sc.next();
			System.out.println("enter the ending point");
			String to=sc.next();
			System.out.println("enter km");
			int km=sc.nextInt();
			
	    	a=new prime(from,to,km);
	    	System.out.println("please wait cab is coming");
	    	break;
		}
		    	
		case 3:
		{	System.out.println("enter starting point");
			String from=sc.next();
			System.out.println("enter the ending point");
			String to=sc.next();
			System.out.println("enter km");
			int km=sc.nextInt();
			
	    	a=new sweden(from,to,km);
	    	System.out.println("please wait cab is coming");	
	    	break;
		}		
		}
	}
	
	public void cancelride()
	{
		if(a==null)
		{
			System.out.println("you not book ride");
		}
		else
		{
			a=null;
			System.out.println("your ride is canceled");
		}
	}
	
	public void makepaymennt()
	{
		if(a instanceof mini)
		{
			mini m=(mini)a;
			System.out.println("from="+m.from);
			System.out.println("to="+m.to);
			System.out.println("money="+m.km*m.price);
			System.out.println("enter amount");
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
				System.out.println("payement sucessful");	
			}
			else
			{
				System.out.println("payement not done");
			}
		}
		
		else if(a instanceof prime)
		{
			prime m=(prime)a;
			System.out.println("from="+m.from);
			System.out.println("to="+m.to);
			System.out.println("money="+m.km*m.price);
			System.out.println("enter amount");
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
				System.out.println("payement sucessful");	
			}
			else
			{
				System.out.println("payement not done");
			}
		}
		
		else if(a instanceof sweden)
		{
			sweden m=(sweden)a;
			System.out.println("from="+m.from);
			System.out.println("to="+m.to);
			System.out.println("money="+m.km*m.price);
			System.out.println("enter the amount");
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
				System.out.println("payement sucessful");	
			}
			else
			{
				System.out.println("payement not done");
			}
		}
	}
	
	public static void main(String[]args)
	{
		oladrive a =new oladrive();
		for(;;)
		{
			System.out.println("1.makeride 2.cancelride 3.makepayement 4.exit");
			switch(sc.nextInt())
			{
			case 1:
				a.makeride();
				break;
			case 2:
				a.cancelride();
				break;
			case 3:
				a.makepaymennt();
				break;
			case 4:return;
	
			}
		}
	}
}


	
	
