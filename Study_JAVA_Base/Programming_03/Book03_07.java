
public class Book03_07 {
	public static void main(String[] args) {
		int i[] = new int[10], sum=0;
		
		for(int a=0;a<10;a++) {
			i[a]=(int)(Math.random()*10+1);
			sum+=i[a];
			System.out.print(i[a]+" ");
		}
		System.out.println("\naverage is "+(double)sum/10);
	}
}
