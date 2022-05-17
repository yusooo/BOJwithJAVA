//Try Catch : 예외처리

public class Day06_TryCatch {
	public static void main(String[] args) {
		
		int IntArray[]=new int[5]; 				//IntArray라는 변수에 5만큼의 공간을 배열로 선언
		
		try { 									//try 구문 내에서 시도를 하다가 에러 발생시 catch 구문으로 이동
			IntArray[3] = 10;
			IntArray[6] = 1;
			Exception e = null;
			throw e; 							//예외 던지기 => 고의 에러 발생
		}
		catch(Exception e) {					//e: 에러 객체
			e.printStackTrace(); 				//실제 에러문의 자세한 출력
			System.out.println("배열 범위 초과");
			System.exit(0); 					//프로그램 강제 종료, return 사용 권장
		}
		
		System.out.println("프로그램 종료");
	}
}
