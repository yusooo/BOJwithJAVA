import java.util.Scanner;

public class Book02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)");
		int a = sc.nextInt();
		if(a/10==a%10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		sc.close();
	}
}
