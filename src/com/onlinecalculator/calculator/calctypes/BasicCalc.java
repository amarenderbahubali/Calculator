package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	int a,b,c,ch,res;
	
	public BasicCalc()
        {
		a=0 ;
		b=0 ;
		c=0;
		res=0;
	}
	
	public int menu()
        {
    	System.out.println("1 for addition");
    	System.out.println("2  for substraction");
    	System.out.println("3 for multiplication");
    	System.out.println("4 for division");
    	System.out.println("enter yours choice");
    	Scanner S=new Scanner(System.in);
    	c=S.nextInt();
    	return 0;
    	
	}
	
    public void userInputs()
    {
    	
    	Scanner s=new Scanner(System.in);
        System.out.println(" Enter first number");
        a=s.nextInt();
        System.out.println(" Enter second number");
        b=s.nextInt();
     
        
    }

    public void performOperation()
{
    	
    	switch(c)
    	{
    	case 1: 
               System.out.println("result"+add());
                 break;
    	case 2: 
    	          System.out.println(subtract());
    	        break;
    	case 3: 
    	          System.out.println(multiply());
    	           break;
    	case 4: 
    	   System.out.println(divide());
    	        break;
    	   
	}
}
    
    
	int add()
	{
		res=a+b;
		return res;
	}
	
	int subtract()
	{
		res=a-b;
		return res;
		
	}
	
	int multiply()
	{
		res=a*b;
		return res;
		
	}
	
	int divide()
	{
		res=a/b;
		return res;
		
	}
}
	
