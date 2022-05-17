import java.util.Scanner;
public class Day04_Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10 이하의 정수를 입력해주세요.");
		int i = sc.nextInt();
		do{
			System.out.println("현재 i의 값 : "+i);
			i++;
		}while(i<=10);
		System.out.println("while문이 종료되었습니다.");
		
		sc.close();
	}
}
