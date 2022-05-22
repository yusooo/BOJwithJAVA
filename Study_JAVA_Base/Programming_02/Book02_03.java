import java.util.Scanner;
public class Book02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a>=50000) {
			System.out.println("오만원권 " + a/50000 + "매");
			a%=50000;
		}
		if(a>=10000) {
			System.out.println("만원권 " + a/10000 + "매");
			a%=10000;
		}
		if(a>=1000) {
			System.out.println("천원권 " + a/1000 + "매");
			a%=1000;
		}
		if(a>=100) {
			System.out.println("백원 " + a/100 + "개");
			a%=100;
		}
		if(a>=50) {
			System.out.println("오십원 " + a/50 + "개");
			a%=50;
		}
		if(a>=10) {
			System.out.println("십원 " + a/10 + "개");
			a%=10;
		}
		if(a>=1) {
			System.out.println("일원 " + a + "개");
		}
		sc.close();
	}

}
