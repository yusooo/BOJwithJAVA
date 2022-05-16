package Study_Base;

import java.util.Scanner;
public class ForWhiledo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("각 과목의 성적을 입력해주십시오.");
		int sum=0;
		for(int i=0;i<7;i++) {
			sum+=scanner.nextInt();
		}
		System.out.println(sum/7);
		
		int a=0;
		sum=0;
		System.out.println("이번 시간은 While문 체험입니다.");
		while(sum<=100) {
			sum+=a;
			a++;
		}
		System.out.println("1부터 얼마까지 더했더니 " + a + "이 나왔습니다.");
		
		int b=0;
		System.out.println("마지막 시간입니다. do while문 체험입니다.");
		do {
			sum-=b;
			b++;
		}while(b>=sum);
		System.out.println(b);
		scanner.close();
	}
}
