import java.util.Scanner;
public class Book03_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		for(char i=a;i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
