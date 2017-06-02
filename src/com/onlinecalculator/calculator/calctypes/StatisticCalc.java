package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
import java.lang.Math;
public class StatisticCalc extends BasicCalc{
	Scanner sc=new Scanner(System.in);
	double no_array[];
	public int menu()
	{
		 System.out.println("1.addition");
		    System.out.println("2.substraction");
		    System.out.println("3.multiplcation");
		    System.out.println("4.division");
		    System.out.println("5.mean");
		    System.out.println("6.meadian");
		    System.out.println("7.mode");
		    System.out.println("8.standard deviation");
		    System.out.println("9.exit");
		    System.out.println("enter your choice");
		    ch=sc.nextInt();
		    return (ch);
			}	
		
	

    public void userInputs()
    {
    	if(ch>=5 && ch<=8){
    		System.out.println("enter the total number of values");
    		int len=sc.nextInt();
    		no_array=new double[len];
    		for(int i=0;i<no_array.length;i++){
    			System.out.println("enter data:");
    			no_array[i]=sc.nextInt();
    		}
    	}
    	else{
    		System.out.println("enter first number");
    		a=sc.nextInt();
    		System.out.println("enter second number");
    		b=sc.nextInt();
    	}
    }

    public void performOperation(){    	
    		switch(ch)
    		{
    		case 1:
    		case 2:
    		case 3:
    		case 4:
    			super.performOperation();
    			break;
    		case 5:
    			System.out.println("Result:"+mean());
    			break;
    		case 6:
    			System.out.println("Result:"+median());
    			break;
    		case 7:
    			System.out.println("Result:"+mode());
    			break;
    		case 8:
    			System.out.println("Result:"+Math.sqrt(mode()));
    			break;
    		case 9:
    			System.out.println("Thank you");
    			break;
    		default:
    			System.out.println("Invalid selection");
    		}
    			
    	}
       

    

    	
       
    
    
	double mean()
	{
		double sum=0;
		for(int i=0;i<no_array.length;i++){
			sum+=no_array[i];
		}
		double meanValue=sum/no_array.length;
		return meanValue;
		}
			
	
	
	double median()
	{
		int middle=no_array.length/2;
		if(no_array.length%2==1){
			double medianValue=no_array[middle];
			return medianValue;
		}
		else{
			double medianValue=no_array[middle-1]+no_array[middle];
			return medianValue;
		}
		}
			
	
	double mode ()
	{
		double modeValue=no_array[0];
		int maxCount=0;
		for(int i=0;i<no_array.length;i++){
			
			double value=no_array[i];
			int count=1;
			for(int j=0;j<no_array.length;j++){
				
				if(no_array[i]==no_array[j])
				count++;
				
				if(count>maxCount){
					
					modeValue=value;
					maxCount=count;
				}
			}
		}
			
		return modeValue;
	}
}
