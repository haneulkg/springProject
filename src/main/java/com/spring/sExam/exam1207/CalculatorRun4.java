package com.spring.sExam.exam1207;

import java.util.Scanner;

public class CalculatorRun4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Calculator4VO calc = new Calculator4VO();
		
		int ans = 0;
		
		while(true) {
		System.out.print("첫번째 수를 입력하세요?(종료시:0) ");
		ans = scanner.nextInt();
		
		if(ans != 0) calc.setSu1(ans);
		else break;
		
		System.out.print("두번째 수를 입력하세요? ");
		calc.setSu2(scanner.nextInt());
		
		CalculatorService4 calcS = new CalculatorService4();
		
		calcS.add(calc.getSu1(), calc.getSu2());
		calcS.sub(calc.getSu1(), calc.getSu2());
		calcS.mul(calc.getSu1(), calc.getSu2());
		calcS.div(calc.getSu1(), calc.getSu2());
		}
		
		System.out.println("작업종료");
		scanner.close();
	}
}