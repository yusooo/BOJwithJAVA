import java.util.Scanner;

public class Book04_05 {
	private double x, y;
	private int radius;
	public Book04_05(double x, double y, int radius) {
		x=0;
		y=0;
		radius=0;
	}
	public String show() {
		String a = "("+x+","+y+")"+radius;
		return a;
	}
}

class CircleManager{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book04_05 c [] = new Book04_05[3];
		for(int i=0;i<3;i++) {
			System.out.print("x, y, radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i]= new Book04_05(x, y, radius);
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].show()+"");
		}
		sc.close();
	}
}