
public class Book03_09 {
	public static void main(String[] args) {
		int a[][] = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*10+1);		// 정수형 n~m범위 수 랜덤 생성하기
				System.out.print(a[i][j]+"\t");			// (형)(Math.random()*(최댓값-최솟값+1)+(최솟값));
				}
			System.out.println("");
		}
	}
}
