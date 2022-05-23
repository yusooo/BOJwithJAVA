import java.util.Scanner;
public class Book02_11_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=3 && a<=5) System.out.println("봄");
		else if(a>=6 && a<=8) System.out.println("여름");
		else if(a>=9 && a<=11) System.out.println("가을");
		else if(a<=1 || a==12) System.out.println("겨울");
		else System.out.println("잘못입력");
		
		sc.close();
	}
}
