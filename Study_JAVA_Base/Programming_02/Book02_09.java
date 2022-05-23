import java.util.Scanner;
public class Book02_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double r = sc.nextDouble();
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(Math.sqrt(x-a)+Math.sqrt(y-b)<=r) {
			System.out.println("("+x+","+y+") is placed in the round.");
		}
		else System.out.println("It didn't placed in the round.");
		
		sc.close();
	}
}
