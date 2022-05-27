
public class Day10_ClassAndObject_01 { 			// 클래스 선언 : class 키워드
												// 클래스 중괄호 안에 필드와 메소드를 모두 작성
												// 캡슐화의 원칙에 따라 클래스 외부에는 필드, 메소드 작성 금지
	static class Circle{
		
		// 필드 (변수)
		public int radius;						// 원의 반지름 필드
		public String name;						// 원의 이름 필드
		
		// 메소드
		public Circle() {						// 원의 생성자 메소드, 클래스 이름과 동일한 메소드는 생성자constructor라고 부름
			System.out.println(" ");
		}
		public double getArea() {				// 원의 면적 계산 메소드
			return 3.14*radius*radius;
		}
	
		public static void main(String[] args) {	// main 메소드 (메소드 : 멤버 함수)
			Circle pizza;							// Circle 객체에 대한 레퍼런스 변수 pizza 선언과 동시에 Circle 객체 생성
			pizza = new Circle();
			
			pizza.radius = 10;						// radius 필드에 10 저장
			pizza.name = "자바피자";					// name 필드에 "자바피자" 저장
			double area = pizza.getArea();			// pizza 객체의 면적 알아내기
			
			System.out.println(area);
		
		}
	}
	
}

// 정리
// 1. class 키워드로 클래스 생성
// 1-1. 클래스 내에 변수 및 함수 생성해놓기
// 2. (클래스 이름).(객체이름) = new (클래스이름)(); 을 통해 객체 생성
// 3. (객체 이름).(클래스 내 변수)를 통해 (객체 이름).(클래스 내 함수) 사용 가능