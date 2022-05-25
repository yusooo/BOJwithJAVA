import java.util.Scanner;
public class Book03_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		int us = 0;
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		while(true) {
			System.out.println("가위 바위 보!! >>> ");
			String user = sc.nextLine();
			int com = (int)(Math.random()*3);
			
			if(user.equals("가위")) us = 0;
			else if (user.equals("바위")) us = 1;
			else if (user.equals("보")) us = 2;
			else if (user.equals("그만")) break;
			
			if(us==com) System.out.println("사용자 = "+ str[us] + " , 컴퓨터 = " + str[com] + " 비겼습니다.");
			else if(us<com || us==3&&com ==1) System.out.println("사용자 = " + str[us] + " , 컴퓨터 = " + str[com] + " 컴퓨터가 이겼습니다.");
			else if(us>com || us==1&&com ==3) System.out.println("사용자 = " + str[us] + " , 컴퓨터 = " + str[com] + " 사용자가 이겼습니다.");
		}
		sc.close();
		return;
	}
}