package com.arsenii.calculator;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.arsenii.calculator.calculations.SpecificCalculation;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I like trains and memes.... Let's fart
		//Testing again
		String answer = "";
		String run = "Y";
		boolean on = true;
		System.out.print("Please enter a problem: ");
		Scanner user_input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		while (run.equals("Y")) {
			try {
				answer = "";
				BigDecimal Answer = new BigDecimal(0);
			    String A = "0.0";
		        String B = "0.0";
		        a = 0.0;
		        b = 0.0;
			    String function = "  ";
		        String problem = user_input.nextLine();
		        StringTokenizer token = new StringTokenizer(problem, " ");
		        CalculationFactory isEnough = new CalculationFactory();
		        if (isEnough.isEnoughTokens(3, problem)) {
		    	    A = token.nextToken();
		    	    function = token.nextToken();
		    	    B = token.nextToken();
		    	    if (A.contains("/") == false) {
		    	    a = Double.parseDouble(A);
		    	}
		    	else {
		    		String[] parts1 = A.split("\\b");
		            String numeratorA = parts1[0];
		            String denominatorA = parts1[2];
		            a = Double.parseDouble(numeratorA) / Double.parseDouble(denominatorA); 
		    	}
		    	if (B.contains("/") == false) {
		    	    b = Double.parseDouble(B);
		    	}
		    	else {
		    		String[] parts2 = B.split("\\b");
		            String numeratorB = parts2[0];
		            String denominatorB = parts2[2];
		            b = Double.parseDouble(numeratorB) / Double.parseDouble(denominatorB);
		    	}
		    }
		    else {
		    	System.out.println("There isn't 3 arguments. Please try again: ");
		    	continue;
		    }
		    if ((function.equals("/") || function.equals("%")) & b == 0) {
		    	System.out.println("0 is not a valid number for dividing,\n please try again:");
		    	continue;
		    }
		    SpecificCalculation calc = CalculationFactory.getSpecificCalculation(function);
			if (calc == null) {   
				System.out.println("Not supported operation. Please enter +, -, *, /, or % : ");
				continue;   
			} else {
				CalculationFactory preAns = new CalculationFactory();
				answer = preAns.CalculateAnswer(a, function, b);
			}
		    if (!(function.equals("%"))) {
		    	Answer = new BigDecimal(answer);
			    System.out.println("Answer = " + Answer.stripTrailingZeros().toPlainString());
		    }
		    else { System.out.println("Answer = " + answer); }
			System.out.println("Want to try again? (Y/N): ");
			run = user_input.next();
			user_input.nextLine();
			if (run.equals("Y")) {
				continue;
			}
			else {
				user_input.close();
				break;
			}
			}catch (NumberFormatException e) {
  	          System.out.println("Program does not accept algebra equations \n"
  	          		+ "or other symbols that are not numbers. try again: ");
  	          on = true;
      	      try{
                Thread.sleep(100);
                }catch(InterruptedException ex){   
                ex.printStackTrace();
             }
           }
			if (on == true) {
				continue;
			}
		}
		System.exit(1);
      }
}