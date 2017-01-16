package com.arsenii;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		String Again = "yes";
		if (Again.toUpperCase().equals("Y")) {
       	 Again = "YES";
        }
        boolean yes = Again.toUpperCase().equals("YES");             
        boolean no = Again.toUpperCase().equals("NO");
        boolean notAnswered1 = true;
		while (yes) {
		 long prevVal = 1;
	     long prevPrevVal = 0;
	     long currVal = 0;
	     int Counter=0;
	     int Error = 1;
	     double n = 0;
	         System.out.println("type in a number\n");
	         while (Error == 1) {
	        	 
	        	 try {
	        	 n = user_input.nextDouble();
	             
	        	 if (n == 0) {
	        	     break;
	             }
	        	 if (Double.compare(n - Math.round(n),0.00) != 0) {
		        	 System.out.println("Error: No Decimal points, try again");
		        	 continue;
		         }
	        	 if ((Double.compare(n - Math.round(n),0.00) != 0) && (n > 91)) {
		        	 System.out.println("Error: No Decimal points, try again");
		        	 System.out.println("Error: Number too high, try again");
		        	 continue;
		         }
	        	 if (n > 91) {
	        		 System.out.println("Error: Number too high, try again");
	        		 continue;
	        	 }
	        	 if ((n == Math.round(n)) && (n > 0)){
	        		 break;
	        	 }
	        	 if ((Double.compare((n - Math.round(n)),0.00) != 0) && (n < 0)) {
	        		 System.out.println("Error: No negative numbers, try again");
	        		 System.out.println("Error: No Decimal points, try again");
	        		 continue;
	        	 }
	        	 else if (n < 0) {
	        		 System.out.println("Error: No negative numbers, try again");
	        		 continue;
	        	 }
	             } catch (InputMismatchException e) {
        	          System.out.println("Error: only numbers, try again");
        	          user_input.nextLine();
    	              //sleep
	        	      try{
	                  Thread.sleep(100);
	                  }catch(InterruptedException ex){
	                  ex.printStackTrace();
	               }
	        	 continue;
	        	 
	             }
	             }
	         if (n == 0) {
	        	 break;
	         }
	         while ((Counter < n) && ((prevVal + prevPrevVal) > 0)) { // < java.lang.Long.MAX_VALUE))  {
	             currVal = prevVal + prevPrevVal;
	        	 prevPrevVal = prevVal;
	        	 prevVal = currVal;
	             System.out.print(currVal + ", ");
	             Counter = Counter + 1;
	         }
	         System.out.println("\n" + Counter + " numbers printed");
	         System.out.printf("\nAgain? Yes/No\n");
	             boolean notAnswered = true;
	             notAnswered1 = true;
	             while (notAnswered == true) {
	            	 yes = true;
	            	 no = false;
	                 Again = user_input.next();
	             
	                 if (Again.toUpperCase().equals("Y")) {
	            	     Again = "YES";
	            	     notAnswered = false;
	            	     notAnswered1 = false;
	            	     continue;
	                 }
	                 yes = Again.toUpperCase().equals("YES");
	                 if (yes) {
	                	 Again = "YES";
	                	 notAnswered = false;
	                	 notAnswered1 = false;
	                	 continue;
	                 }
	                 if (Again.toUpperCase().equals("N")) {
	            	 Again = "NO";
	            	 notAnswered = false;
	            	 notAnswered1 = false;
	            	 user_input.close();
	            	 break;
	                 }
	                 no = Again.toUpperCase().equals("NO");
	                 if (no) {
	                	 Again = "NO";
		            	 notAnswered = false;
		            	 notAnswered1 = false;
		            	 user_input.close();
		            	 break;
	                 }
	                 if (!(yes || no)) {
	                	 while (notAnswered1 == true) {
		        	     System.out.println("Is that Yes or No? : ");
		        	     Again = user_input.next();
		        	     if (Again.toUpperCase().equals("Y")) {
		            	     Again = "YES";
		            	     notAnswered = false;
		                 }
		                 yes = Again.toUpperCase().equals("YES"); 
		        	     if (yes) {
		        	    	 notAnswered = false;
		        	    	 Again = "YES";
		        	    	 notAnswered1 = false;
		        	    	 
		        	     }
		        	     if (Again.toUpperCase().equals("N")) {
			            	 Again = "no";
			            	 notAnswered = false;
			            	 user_input.close();
			            	 break;
			                 }
			                  no = Again.toUpperCase().equals("NO");
		        	     if (no) {
		        	    	 user_input.close();
		        	    	 notAnswered = false;
		        	    	 Again = "NO";
		        	    	 notAnswered1 = false;
		        	    	 break;
		        	     }
		        	     if (!(yes || no)) {
		        	        continue;
	                     }
	                 }   
	              }    
	         }
	    }
    }
}