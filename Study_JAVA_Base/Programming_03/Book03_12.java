
public class Book03_12 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("명령 인자가 없습니다.");
			return;
		}
		int sum=0;
		for(int i=0;i<args.length;i++) {
			try {
				sum+=Integer.parseInt(args[i]);	
			}
			catch(NumberFormatException e) {
				i--;
			}
		}
		System.out.println(sum);
	}
}
