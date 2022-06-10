import java.util.Scanner;
class Phone{
	public int name;
	public int phone;
	Book04_08 book[] = new Book04_08();
}
public class Book04_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 >>");
		int peoplenum = sc.nextInt();
		for(int i=0;i<peoplenum;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력) >>");
			String name = sc.next();
			String phone = sc.next();
		}
		System.out.println("저장되었습니다...");
		while(true) {
			String user = sc.next();
			if(user == "그만") break;
			
		}
	}
}
