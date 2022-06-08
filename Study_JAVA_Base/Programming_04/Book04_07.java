import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}
public class Book04_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int input = sc.nextInt();
			if(input == 1) {
				System.out.print("날짜 입력(1~31) >>");
				int inputDate = sc.nextInt();
			}
			else if(input == 2) {
				
			}
			else {
				break;
			}
		}
		sc.close();
	}
}
