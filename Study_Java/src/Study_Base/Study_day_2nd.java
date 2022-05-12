package Study_Base;

public class Study_day_2nd {
	public static void main(String[] args) {
		String toolName = "JDK"; //문자열 변수 선언, 값은 "JDK"로 초기화
		System.out.println(toolName + "1.8" + "이 출시됨"); //toolName의 값 뒤에 1.8과 "이 출시됨"을 붙여서 출력
		
		//변수 선언
		int price; //데이터타입 변수이름
		char c1, c2, c3; // 같은 타입의 변수 여럿 선언 -> 콤마 사용
		int radius = 10; //선언과 동시에 초깃값 지정
		radius = radius *5; //변수 radius의 값을 읽고 5를 곱해 radius에 저장
		
		//리터럴 : 프로그램에 직접 표현한 값
				//정수리터럴
				int n = 15; //십진수 15
				int m = 015; //015는 8진수, 십진수 13
				int k = 0x15; //0x15는 16진수로서 십진수 21
				int b = 0b0101; //0b0101은 2진수로서 십진수 5
				//int 타입으로 자동 컴파일, Long타입으로 지정 위해 숫자 뒤에 L 또는 l 붙이기
				
				//실수리터럴 : 소수점 혹은 지수(exponent) 형태로 실수 표현 값
				double d=0.1234; //실수타입은 double타입으로 자동 처리
				double w=.1234D; //숫자 뒤에 d 혹은 D를 붙여 double 타입으로 강제 변환
				float f = 0.1234f; //숫자 뒤에 f 혹은 F를 붙여 float 타입으로 강제 변환
				//float f = 0.1234 -> 컴파일 오류
				
				//문자리터럴 : 단일 인용부호('')로 문자 표현 혹은 \.u 다음 문자의 유니코드 값 사용으로 표현
				char a = 'A';
				//char a2 = \u0041; //문자 'A'의 유니코드 값(0041) 사용
				//특수문자 리터럴 : 백슬래시(\) 뒤에 특수 기호를 붙여 표현, 이스케이프 시퀀스라고도 표현
				// \b = 백스페이스, \t = 탭, \n = 라인피드, \f = 폼피드, \r = 캐리지 리턴
				// \" = 이중 인용부호, \' = 단일 인용부호, \\ = 백슬래시
				
				//논리리터럴 : true와 false의 두 타입만 존재
				boolean e = true;
				boolean boo = 10 > 0; //10>0이 참이므로 b의 값은 true
				//boolean c = 1; //타입 불일치 오류. C나 C++과 다르게 숫자를 참, 거짓으로 사용 불가.
				//while(true) {} //자바 무한루프. while(1)은 사용 불가.
		//상수 : 변수와 달리 실행 중 값 변경 불가능.
				final double PI = 3.141592; //final로 상수 선언, 이후 변수 선언과 같음
				
		//타입 변환 : 변수, 상수 혹은 리터럴의 타입을 다른 타입으로 변환하는 것
				//자동 타입 변환 : 수식 내 혹은 치환문에서 타입이 일치하지 않을 때 -> 오류 대신 작은 타입을 큰 타입으로 자동 변환
					long lo=25; //리터럴 25는 int 타입이지만 25가 long 타입으로 변환
					double dou=3.14*10; //실수 연산을 위해 10이 10.0으로 자동 변환
				//강제 타입 변환, 캐스팅이라고도 부름
					int num = 300;
					//byte bi=n; //컴파일 오류, int 타입은 byte 타입으로 자동 변환 안 됨
					//변수 n에 저장된 값 300이 byte 값의 범위 (0~255)보다 크기 때문에 컴파일러가 자동 변환 시 256의 나머지값이 저장.
					//큰 타입의 값을 작은 타입의 값으로 변환해야 할 때 자동 변환 대신 컴파일 오류를 발생시킨다
					//타입 변환을 원한다면 강제 타입 변환의 지시
					byte bi = (byte)num; //num을 byte타입으로 강제 변환, bite = 44;
					//범위 초과만큼 데이터 손실 발생. 실수의 정수 강제변환 역시 소수점 이하 손실 발생
	}
}
