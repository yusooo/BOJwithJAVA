import Access.AccessModifier;

public class Day07_AccessModifier {
	public static void main(String[] args) {
		// default : 같은 패키지 내에서만 접근 가능
		//  public  : 다른 패키지에서도 접근 가능
		// private  : 타 패키지 및 클래스에서 접근 불가능
		//protected : 타 패키지에서 접근 불가능 (유사 default)
		//		차이 : extends를 통해 상속을 시키면 타 패키지에서도 접근 가능
		
		AccessModifier access=new AccessModifier();
		System.out.println(access.b);
	}
}
