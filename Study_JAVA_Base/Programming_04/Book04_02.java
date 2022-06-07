import java.util.Scanner;
public class Book04_02{
	private static int math, science, english;
	public int average(int a, int b, int c) {
		return (math+science+english)/3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>");
		int math = sc.nextInt(), science = sc.nextInt(), english = sc.nextInt();
		Book04_02 me = new Book04_02();
		System.out.println("평균은 " + me.average(math, science, english) );
		
		sc.close();
	}
}
