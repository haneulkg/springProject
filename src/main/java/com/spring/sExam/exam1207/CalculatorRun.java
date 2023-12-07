package com.spring.sExam.exam1207;

public class CalculatorRun {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setSu1(100);
		calc.setSu2(50);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
