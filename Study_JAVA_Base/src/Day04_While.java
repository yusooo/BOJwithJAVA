//조건반복문 3 : While, do~While문
public class Day04_While {
	
	public static void main(String[] args) {
		int i=0;
		
		System.out.println("While문 시작");
		while(i<10) {
			System.out.println("i의 값 : "+i);
			i++;
		}
		System.out.println("while문 종료");
		
		System.out.println("Do ~ While문 시작");
		do {
			System.out.println("i의 값 : "+i);
			i--;
		}while(i>10);
	}
}
