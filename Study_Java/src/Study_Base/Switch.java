package Study_Base;

import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String grade = scanner.nextLine();
		switch(grade) {
			case "A":
				System.out.println("A학점 : 학과 대표 담당입니다.");
				break;
			case "B":
				System.out.println("B학점 : 평범한 대학생입니다.");
				break;
			case "C":
				System.out.print("C학점 & ");
			case "D":
				System.out.println("D학점 : 슬슬 교수님의 눈초리를 받기 시작합니다.");
				break;
			case "F":
				System.out.println("안타깝네요. 재수강 당첨입니다.");
				break;
		}
		System.out.println("시스템을 종료합니다.");
		scanner.close();
	}
}
