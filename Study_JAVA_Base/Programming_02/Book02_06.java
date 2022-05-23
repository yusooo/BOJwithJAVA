import java.util.Scanner;
public class Book02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if((a/10)%3==0 && (a%10)%3==0) System.out.println("박수짝짝!!");
		else if((a/10)%3==0 && (a%10)%3!=0) System.out.println("박수짝!");
		else if((a/10)%3!=0 && (a%10)%3==0) System.out.println("박수짝!");
		
		sc.close();
	}
}
