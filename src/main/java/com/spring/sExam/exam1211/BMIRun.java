package com.spring.sExam.exam1211;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	비만도(BMI)를 계산하는 프로그램 만들기
	공식 : 몸무게 / (키백분율 * 키백분율)
	ex ) 키 : 170cm, 몸무게 65kg
		비만지수 구하는 공식 : 65 / (1.7 * 1.7)
  	비만지수에 대한 판정?
    저체중: 18.5미만, 표준 : 18.5~23 , 과체중:23~25, 비만:25초과

  	데이터의 주입은 xml을 통해서 처리한다.(입력값 : 비만지수값, 개인별 성명/키/몸무게)
*/
public class BMIRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/bmi.xml");
		
		BMIVO vo = new BMIVO();
		
		vo.getService().printLine();
		
		BMIVO[] bmis = {(BMIVO) ctx.getBean("person1"), (BMIVO) ctx.getBean("person2"), (BMIVO) ctx.getBean("person3")};
		
		for(BMIVO v : bmis) {
			vo.getService().printBMI(v);
			vo.getService().printLine();
		}
		 
		ctx.close();
	}
}
