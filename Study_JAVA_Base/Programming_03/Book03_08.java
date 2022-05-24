import java.util.Scanner;
public class Book03_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num[] = new int[count], a;
		sc.close();
		
		for(a=0;a<count;a++) {
			num[a]=(int)(Math.random()*10+1);
		}
		for(a=0;a<count;a++) {
			for(int j=0;j<a;j++) {
				if(num[a]==num[j]) num[j]=(int)(Math.random()*10+1);
				j--;
			}
		}
		for(a=0;a<count;a++) {
			System.out.print(num[a]+" ");
		}
	}
}
