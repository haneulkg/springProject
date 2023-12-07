package com.spring.sExam.exam1207;

public class CalculatorRun2 {
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2(100,500);
		
//		calc.setSu1(100);
//		calc.setSu2(500);
		
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
	}
}
