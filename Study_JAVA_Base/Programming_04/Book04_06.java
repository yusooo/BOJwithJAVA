import java.util.Scanner;

public class Book04_06 {
	double x, y;
	int radius;
	public Book04_06(double x, double y, int radius) {
		x=0;
		y=0;
		radius=0;
	}
}

class CircleManage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book04_06 c [] = new Book04_06[3];
		for(int i=0;i<3;i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i]= new Book04_06(x, y, radius);
		}
		int max=c[0].radius;
		for(int i=0;i<c.length;i++) {
			if(max<=c[i].radius) max=i;
		}
		System.out.println("가장 면적이 큰 원은 ("+c[max].x+","+c[max].y+")"+c[max].radius);
		sc.close();
	}
}