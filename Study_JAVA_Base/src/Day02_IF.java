//조건문 1 : if문, if~else문, if~else if~else문
public class Day02_IF {

	public static void main(String[] args) {
		int a=1;
		
		if(a==1) {
			System.out.println("a의 값은 "+a+"이다.");
		}
		
		int b=0;
		if(b==1) {
			System.out.println("b의 값은 "+b+"이다.");
		}
		else {
			System.out.println("b의 값은 "+a+"가 아니라 "+b+"이다.");
		}
		
		int c=4;
		if(c==2) {
			System.out.println("c의 값은 "+c+"이다.");
		}
		else if(c==4) {
			System.out.println("c의 값은 "+a+"가 아닌 "+c+"이다.");
		}
		else {
			System.out.println("c의 값은 "+a+"도 아니고 "+b+"도 아니다.");
		}
	}

}
