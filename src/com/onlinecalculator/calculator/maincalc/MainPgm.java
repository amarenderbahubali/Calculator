package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        char type;
        type=getType();
        if(type=='a')
        {
        	BasicCalc B=new BasicCalc();
			B.menu();
			B.userInputs();
			B.performOperation();
        }
        if(type=='b')
        {
        	ScientificCalc scalc=new ScientificCalc();
       		scalc.menu();
       		scalc.userInputs();
       		scalc.performOperation();
       	}
        	
       	
        	
        	if(type=='c')
        	{
        		StatisticCalc staccalc=new StatisticCalc();
           		staccalc.menu();
           		staccalc.userInputs();
           		staccalc.performOperation();
        	}
 
    
        
 	
        	}
 
    
        
    static char getType()
    {
    	 Scanner s=new Scanner(System.in);
    	    System.out.println("......****....");
    	    System.out.println("1: BasicCalc");
    	    System.out.println("2: ScientificCalc");
    	    System.out.println("3: StaticsticCalc");
    	    System.out.println(".....****.....");
    	    System.out.println("Enter your choice");
    	    int ch=s.nextInt();
    	    if(ch==1)
    	        return 'a';
    	        else if(ch==2)
    	        	return 'b';
    	        else if (ch==3)
    	        	return 'c';
    	        else
    	        	System.out.println("Invaild selection");
    	        return 'd';
    	        }

    	        	
    	        
 	
    }
