import java.util.Scanner;
public class Book02_11_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		switch(a) {
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
		case 0 :
		case 1 :
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못입력");
			break;
		}
		sc.close();
	}
}
