import java.util.Scanner;
public class Book02_12_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		String g = sc.nextLine();
		
		switch(g) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			if(b==0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.println(a/b);
		}
		
		sc.close();
	}
}
