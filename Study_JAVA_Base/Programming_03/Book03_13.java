
public class Book03_13 {
	public static void main(String[] args) {
		for(int i=1;i<=99;i++) {
			if((i/10)%3==0 && i/10!=0) {
				if((i%10)%3==0) System.out.println(i+" Clap Clap!!");
				else System.out.println(i+" Clap!!");
			}
			else if((i%10)%3==0 && i%10!=0) System.out.println(i+" Clap!");
		}
	}
}
