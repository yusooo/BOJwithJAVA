import java.util.Scanner;
public class Book02_12_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		String g = sc.nextLine();
		double b = sc.nextInt();
		
		if(g=="+") System.out.println(a+b);
		else if(g=="-") System.out.println(a-b);
		else if(g=="*") System.out.println(a*b);
		else if(g=="/") {
			if(b==0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.println(a/b);
		}
		
		sc.close();
	}
}
