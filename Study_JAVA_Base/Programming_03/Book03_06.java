import java.util.Scanner;
public class Book03_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0;i<8;i++) {
			if(a/unit[i]!=0) {
				System.out.println(unit[i]+"원 짜리 : "+ a/unit[i] + "개");
			}
			a%=unit[i];
		}
		
		sc.close();
	}
}
