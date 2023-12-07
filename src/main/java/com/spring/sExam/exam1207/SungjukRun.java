package com.spring.sExam.exam1207;

import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SungjukVO vo = null;
		
		while(true) {
			vo = new SungjukVO();
			
			System.out.println();
			System.out.print("성명을 입력하세요?(종료시:0) ");
			vo.setName(scanner.next());
			if(vo.getName().equals("0")) break;
			
			System.out.print("국어 점수를 입력하세요? ");
			vo.setKor(scanner.nextInt());
			
			System.out.print("영어 점수를 입력하세요? ");
			vo.setEng(scanner.nextInt());
			
			System.out.print("수학 점수를 입력하세요? ");
			vo.setMat(scanner.nextInt());
			System.out.println();
			
			vo.sungjukTitle();
			vo.sungjukCalc();
			vo.sungjukPrint();
		}
		System.out.println("------------------------------------------------------------------");
		scanner.close();
	}
}
