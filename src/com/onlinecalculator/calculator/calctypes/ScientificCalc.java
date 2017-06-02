package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	public int menu(){
  	

		System.out.println("1 for addition");
    	System.out.println("2  for substraction");
    	System.out.println("3 for multiplication");
    	System.out.println("4 for division");
    	System.out.println("5 for power");
    	System.out.println("6  for squareroot");
    	System.out.println("7 for sin");
    	System.out.println("8 for exit");
    	System.out.println("enter yours choice");
    	Scanner sc=new Scanner(System.in);
    	c=sc.nextInt();
    	return c;
	}

  public void userInputs()
  {
	  Scanner sc=new Scanner(System.in);
  System.out.println("enter first value");
 a=sc.nextInt();
 if(c!=6&&c!=7){
	 System.out.println("enter second value");
	 b=sc.nextInt();
  }
  }

  public void performOperation(){
  		switch(c)
  		{
  		case 1:
  		case 2:
  		case 3:
  		case 4:
  			super.performOperation();
  			break;
  			
  		case 5:System.out.println("pwrof"+pwrof());
  		
  		break;
  		
  		case 6:System.out.println(sqrtof());
  		break;
  		case 7:System.out.println(sineof());
  		break;
  		case 8:System.out.println("bye");
  		System.exit(0);
  		break;
  		default: 
  			System.out.println("wrong choice");
  		break;
  		
  	}
    System.out.println("\n....\n");  
  }
  	
      
  
  
	double pwrof()
	{
	 return Math.pow(a,b);
}	
	
	
	double sqrtof()
	{
		return(Math.sqrt(a));
	}	
	

	double sineof()
	{
		double rad=Math.toRadians(a);
		return(Math.sin(rad));
			
	}
}

