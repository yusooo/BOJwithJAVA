
public class Book04_03 {
	public char title, artist, country;
	int year;
	public void show(int a, String b, String c, String d){
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	public static void main(String[] args) {
		Book04_03 song = new Book04_03();
		song.show(1978, "스웨덴", "ABBA", "Dancing Queen");
	}
}