package com.spring.sExam.exam1211;

public class BMIService {

	
//	public void calc(BMIVO vo) {
//		double rs = vo.getWeight() / (vo.getHeight()/100 * vo.getHeight()/100);
//		
//		if(rs < 18.5) result = "저체중";
//		else if(rs < 23) result = "표준";
//		else if(rs < 25) result = "과체중";
//		else result = "비만";
//	}
	
	public void printBMI(BMIVO vo) {
		String str = "";
		
		double bmi = vo.getWeight() / ((vo.getHeight()/100.0) * (vo.getHeight()/100.0));
		
		if(bmi < 18.5) str = "'저체중'";
		else if(bmi <= 23) str = "'표준'";
		else if(bmi <= 25) str = "'과체중'";
		else str = "'비만'";
		
		System.out.println(vo.getName()+"님의 BMI계산 결과는 "+str+"입니다");
	}
	
	public void printLine() {
		System.out.println("----------------------------------");
	}
}
