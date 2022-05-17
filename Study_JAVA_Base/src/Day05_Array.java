//배열의 사용
import java.util.Scanner;

public class Day05_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrayInt[] = new int[10]; //0~9까지의 수를 담고 있음
		for(int i=0;i<arrayInt.length;i++) {
			System.out.println(i);
		}
		System.out.println(" ");
		
		int arrayInt2[] = {1,3,5,7,9};
		for(int i=0;i<arrayInt2.length;i++) {
			System.out.println(i);
		}
		System.out.println(" ");
		
		int arrayInt3[] = {1,3,5,7,9};
		for(int i=0;i<arrayInt3.length;i++) {
			System.out.println(arrayInt3[i]);
		}
		System.out.println(" ");
		
		String arrayStr[]= {"a", "b", "c", "d", "e"};
		for(int i=0;i<arrayStr.length;i++) {
			System.out.println(arrayStr[i]);
		}
		System.out.println(" ");
		
		sc.close();
	}
}
