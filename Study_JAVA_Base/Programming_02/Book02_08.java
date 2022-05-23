import java.util.Scanner;
public class Book02_08 {
	public static boolean inRect(int x, int y) {
		if((x>=100&&x<=200)&&(y>=100&&y<=200)) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(inRect(a,b)==true) System.out.println("충돌");
		else System.out.println("충돌하지 않음");
		
		sc.close();
	}
}
