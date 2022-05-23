import java.util.Scanner;
public class Book02_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<=200 && b<=200) System.out.println("("+a+","+b+")는 사각형 안에 있습니다.");
		
		sc.close();
	}
}
