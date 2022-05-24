
public class Book03_02 {
	public static void main(String[] args) {
		int n[][] = {{1}, {1, 2, 3}, {1}, {1,2,3,4}, {1,2}};
		int i=0, j=0;
		for(i=0;i<5;i++) {
			for(j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
