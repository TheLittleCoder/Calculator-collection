package com.arsenii.calculator.calculations;


public class SubtractCalculation implements SpecificCalculation {

	@Override
	public String calculate(double first, double second) {
		double preAns = first - second;
		String answer = (Double.toString(preAns));
		return answer;
	}

}
