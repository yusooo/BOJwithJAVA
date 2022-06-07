
public class Book04_01 {
	public void show(String a, int b, int c) {
		System.out.println(a+"에서 만든 "+b+"년형 "+c+"인치 TV");
	}
	public static void main(String[] args) {
		Book04_01 tv = new Book04_01();
		tv.show("LG", 2017, 32);
	}
}