import java.util.Scanner;
public class Book03_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i=0;i<10;i++) a[i]=sc.nextInt();
		for(int i=0;i<10;i++) if(a[i]%3==0) System.out.print(a[i]+" ");
		sc.close();
	}
}
