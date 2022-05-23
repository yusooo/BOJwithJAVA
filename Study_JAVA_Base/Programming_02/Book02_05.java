import java.util.Scanner;
public class Book02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b>c || b+c>a) System.out.println("삼각형이 됩니다.");
		else if(a+c>b) System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 될 수 없습니다.");
		
		sc.close();
	}
}
