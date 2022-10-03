package com.sj.sbs;
import java.util.Scanner;
public class ShopBillingSystem
{
	static int c;
	static boolean flag;
	static double total=0;
	static Scanner sc= new Scanner(System.in);
    public static void seller()
	{
    	System.out.println("List of Items Available at Shopping Mart are:\n1.Electronics\n2.Bath\r\n"+ "3.Kitchen\r\n"+ "4.Cloths\r\n"+ "5.Others");
    	System.out.println("Press the Item number which you want to purchase: ");
		int btn=sc.nextInt();
		switch(btn)
		{
		case 1:
		{
			do {
				flag= false;
				System.out.println("101*******Pendrive*******1 is =500.00");
				System.out.println("102*******RAM************1 is =1000.00");
				System.out.println(" Enter your code:->....");
				c = sc.nextInt();
				 if(!(c==101||c==102))
				 { 
					 System.out.println("Invalid Input Please Try Again ");
					 flag=true;
				 }
			    }while(flag);
			electronic(c);
			break;
		}
		case 2:
		{
			do {
				flag= false;
				System.out.println("201*******Bucket********1 is = 60.00");
	 			System.out.println("202*******Mug***********1 is = 30.00");
	 			System.out.println("Enter your code:->....");
	 			c = sc.nextInt();
	 			 if(!(c==201||c==202))
				 {
					 System.out.println("Invalid Input Please Try Again ");
					 flag=true;
				 }
			    } while(flag);
	       bath(c);
	       break;
		}
	case 3:
	{
			do {
				flag= false;
				System.out.println("301**********Plate********1.peice is=40.00");
				System.out.println("302**********Spoon********1.peice is=20.00");
				System.out.println("Enter your code:->....");
				c=sc.nextInt();
				if(!(c==301||c==302))
				 {
					 System.out.println("Invalid Input Please Try Again ");
					 flag=true;
				 }
			}while(flag);
			kitchen(c);
			break;
		}
		case 4:
		{
			do {
				flag=false;
				System.out.println("401**********Jeans*********1peice is= 500.00");
	 			System.out.println("402**********shirts********1peice is= 220.00");
	 			System.out.println(" Enter your code:->....");
	 			c = sc.nextInt();
	 			if(!(c==401||c==402))
				 {
					 System.out.println("Invalid Input Please Try Again ");
					 flag=true;
				 }
			}while(flag);
			cloth(c);
			break;
   	    }
		}
	}
	 public static void electronic(int a)
	 {
		 if(a==101)
		 {
			 System.out.println("You have choosed pendrive....:");
			 System.out.println(" Enter a number of quantity: ");
			 int kg=sc.nextInt();
			 System.out.println("----------------------------------");
			 total =total+(kg*50.00);
		 }
		 if(a==102)
		 {
			System.out.println("You have choosed Ram....:  ");
			System.out.println("Enter  A Number Of quantity:");
			int kg=sc.nextInt();
			System.out.println("------------------------------------");
			total=total+(kg*100.00);
		 }
	 }
	 public static void bath(int a)
	 {
		 if(a==201)
		 {
			 System.out.println("You have choosed Bucket....:");
			 System.out.println("Enter  Number of quantity :");
			 int kg=sc.nextInt();
			 System.out.println("------------------------------------");		  
			 total=total+(kg*41.00); 
	     }
		 if(a==202)
		 {
			 System.out.println("You have choosed Mug....:");
			 System.out.println("Enter  Number of quantity :");
			 int kg=sc.nextInt();
			 System.out.println("------------------------------------");
			 total=total+(kg*35.00);
	     }
		 }
		 public static void kitchen(int a) {
		 if(a==301) 
		 {
			 System.out.println("You have choosed Plate....:.");
				System.out.println("Enter  No of quantity: ");
				 int q= sc.nextInt();
				 System.out.println("-----------------------------");
				 total=total+(q*20.00);
		 }
		 if(a==302) 
		 {
			 System.out.println("You have choosed spoon....:");
				System.out.println("Enter  No of quantity: ");
				 int q = sc.nextInt();
				 System.out.println("-----------------------------");
				 total=total+(q*20.00);
		 }
		 }
		 public static void cloth(int a) {
		 if(a==401) 
		 {
			 System.out.println("You have choosed Jeans....:");
				System.out.println("Enter  no of quantity ");
				 int kg = sc.nextInt();
				 System.out.println("-----------------------------");
				 total=total+(kg*100.00);
		 }
		 if(a==402)
		 {
			 System.out.println("You have choosed shirts....:");
			 System.out.println(" Enter of quantity :");
			 int kg=sc.nextInt();
			 System.out.println("----------------------------------");
			 total=total+(kg*120.00);
		 }
	 } 
		 public static void main(String[] args) {
			int choice;
			ShopBillingSystem aobj= new ShopBillingSystem();
			do {
				seller();
				boolean invalid;
				{
					do {
						invalid=false; 
					System.out.println("Do You Want To Purchase More");
					System.out.println("Continue Press 1");
					System.out.println("Press 2 for Exit");
					choice=aobj.sc.nextInt();
					if(!(choice==1||choice==2))
					{
						System.out.println("Invalid Input Please Try Again  ");
						invalid=true;
					}
				} while(invalid);	
		}
			}while(choice==1);
			System.out.println("    Before Disscount Your Total Bill :- "+aobj.total);
			if(aobj.total>=500)
			{
				double dis =(aobj.total/100)*5;
				aobj.total=aobj.total-dis;
				System.out.println("      Your Disscount %5 is :-    "+dis);
				System.out.println("After Disscount Final Total Bill :- "+aobj.total);
			}		
      }
   }
