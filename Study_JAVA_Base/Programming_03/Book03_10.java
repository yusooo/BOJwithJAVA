
public class Book03_10 {
	public static void main(String[] args) {
		int a[][] = new int[4][4], k=0, i, j;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*10+1);
			}
		}
		while(k<6) {
			i = (int)(Math.random()*4);
			j = (int)(Math.random()*4);
			a[i][j] = 0;
			k++;
		}
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) System.out.print(a[i][j]+"\t");
			System.out.print("\n");
		}
	}
}
