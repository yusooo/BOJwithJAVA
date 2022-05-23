import java.util.Scanner;
public class Book02_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
		
		if(Math.sqrt(d-a)+Math.sqrt(e-b)<=c+f) {
			System.out.println("두 원은 서로 겹친다.");
		}
		else System.out.println("두 원은 겹치지 않는다..");
		
		sc.close();
	}
}
