
public class Book03_11 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("명령행 인자가 없습니다.");
			return;
		}
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println(sum/args.length);
	}
}
