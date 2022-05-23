import java.util.Scanner;
public class Book02_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) System.out.println(b>c?c:b);	// abc or acb
			else System.out.println(a);				// cab
		}
		else {										
			if(a>c) System.out.println(a);			// bac
			else System.out.println(b>c?c:b);		// bca or cba
		}
		
		sc.close();
	}
}

