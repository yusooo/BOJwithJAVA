package Access;

public class AccessModifier_2 {
	public static void main(String[] args) {
		AccessModifier access=new AccessModifier();	//타 패키지의 변수를 access라는 함수명으로 사용해 갖고올 수 있다
		System.out.println(access.a);				//AccessModifier의 a 변수를 갖고올 수 있다
	}
}
