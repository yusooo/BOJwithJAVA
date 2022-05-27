
public class Day11_Extends {
	class Animal{								// 슈퍼 클래스 (부모 클래스)
		
		String name;							// 슈퍼 클래스 객체 1
		int age;								// 슈퍼 클래스 객체 2
		void eat() {							// 슈퍼 클래스 객체 3
			
		}	
		void sleep() {							// 슈퍼 클래스 객체 4
			
		}
		void love() {							// 슈퍼 클래스 객체 5
			
		}
	}
	class Human extends Animal {				// 서브 클래스 (자식 클래스)
		//.										// 서브 클래스 객체는 슈퍼 클래스의 멤버와 서브 클래스의 멤버를 모두 가짐
		//.										// 서브 클래스 객체 : 슈퍼 클래스 객체 1~5 포함
			
		String hobby;							// 서브 클래스 객체 1
		String job;								// 서브 클래스 객체 2
		void work() {							// 서브 클래스 객체 3
		}
		void cry() {							// 서브 클래스 객체 4
		}		
		void laugh() {							// 서브 클래스 객체 5
		}
	}
	public static void main(String[] args) {	// 
		
	}
}
												// 객체 = 클래스의 인스턴스instance
