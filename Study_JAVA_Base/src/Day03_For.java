//조건반복문 2 : For문
public class Day03_For {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {				//여기에는 ; 붙이지 않을 것
			System.out.println("안녕");
		}
		
		System.out.println("실행 구조를 알아보자");
		for(int i=0;i<5;i++) {
			System.out.println("i의 값 : "+i);
		}
		
		String str[]= {"하나", "둘", "셋"};
		for(int i=0;i<str.length;i++){		//length : 길이
			System.out.println("length 활용 i값 : "+i);
		}
	}

}
