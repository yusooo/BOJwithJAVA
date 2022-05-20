public class Day08_Method {
	public static void main(String[] args) {
		//메소드 없음
		
		String a="hello";
		String b="Yuso";
		
		System.out.println(a + ", " + b);
		
		//메소드 있음
		
		Day08_Method Day08_Method = new Day08_Method();		//클래스 생성
		
		String c="This is Method";						
		String d="Isn't it wonderful?";
		
		Day08_Method.StrCombine(c, d);						// 메소드 실행 (String 타입 변수 2개를 넘겨줌=매개변수)
		
		
	}
	
	public void StrCombine(String a, String b) {
		String result = a+". "+b;
		System.out.println(result);
	}
}

															// 메소드는 C언어의 함수와 비슷한 기능이라 보면 될 듯