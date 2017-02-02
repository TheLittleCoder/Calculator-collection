package com.arsenii.calculator;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import com.arsenii.calculator.calculations.AddCalculation;
import com.arsenii.calculator.calculations.DivAndRemCalculation;
import com.arsenii.calculator.calculations.DivisionCalculation;
import com.arsenii.calculator.calculations.MultiplyCalculation;
import com.arsenii.calculator.calculations.SpecificCalculation;
import com.arsenii.calculator.calculations.SubtractCalculation;

public class CalculationFactory {

		public static SpecificCalculation getSpecificCalculation(String function) {
			
			SpecificCalculation calc;
			
			if (function.equals("+")) {
				calc = new AddCalculation();
			}
			else if (function.equals("-")) {
				calc = new SubtractCalculation();
			}
			else if (function.equals("*")) {
				calc = new MultiplyCalculation();
			}
			else if (function.equals("/")) {
				calc = new DivisionCalculation();
			} 
			else if (function.equals("%")) {
				calc = new DivAndRemCalculation();
			} 
		     else {
			    calc = null;
			}
			return calc;
		}
		public String CalculateRemAnswer(double a, double b) {
			DivAndRemCalculation preAns = new DivAndRemCalculation();
			String Answer = preAns.calculate(a, b);
			return Answer;
		}
		public String CalculateAnswer(double a, String function, double b) {
			SpecificCalculation calc = CalculationFactory.getSpecificCalculation(function);
			String answer = "";
			answer = calc.calculate(a,b);
			return answer;
		}
		public boolean isEnoughTokens(int tokens, String problem) {
			try {
				StringTokenizer token = new StringTokenizer(problem);
				if (token.countTokens() == tokens) {
					return true;
				}
				else {
					return false;
				}
			} catch (NoSuchElementException e) {
				return false;
			}
		}
}
