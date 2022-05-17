package Access;
//보통 클래스 첫 글자는 대문자로 시작
public class AccessModifier {
	
	String a="yuso";	//접근 제한자 중 default 상태에 해당
						//같은 패키지 폴더 내에서만 접근 가능
		
	public String b="yuso_public";
						//접근 제한자 중 public 상태에 해당
						//다른 패키지 폴더에서도 접근 가능
	
	public static void main(String[] args) {
		
	}
}
