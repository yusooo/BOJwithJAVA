
public class Day09_Constructor_00 {
	//전역변수들
	String name;								// 이름
	int age;									// 나이
	String hobby;								// 취미
												// 베이스 제작
	public Day09_Constructor_00 (String _name, int _age, String _hobby) {
		this.name = _name;
		this.age = _age;
		this.hobby = _hobby;   					// this : 현재 클래스 (헷갈리지 않을 수 있도록 삽입)
	}			
	
	
}
