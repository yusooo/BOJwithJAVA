import java.util.Scanner;
public class Book02_01 {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>>");
		
		int dollar = sc.nextInt();
		
		System.out.println(dollar+"원은 $"+dollar/1100+"입니다.");
		
		sc.close();
	}
}
