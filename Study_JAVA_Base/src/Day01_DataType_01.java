
public class Day01_DataType_01 {

	public static void main(String[] args) {
		//변수형의 선언 : 변수형 변수이름 = 변수값;
		
		//문자형
		char var1 = 'y';	//한 문자 , 따옴표 하나
		String var2="yuso"; //문자열은 쌍따옴표
		
		//정수형
		byte var3=13;		//1byte -128  ~ +127
		short var4=4985; 	//2byte -32768~ +32767
		int var5=999999;	//4byte -21억  ~ +21억
		long var6=999999;	//8byte
		
		//실수형
		float var7=0.1f; 	//4byte, 값 초기화 이후 꼭 숫자 뒤에 f 붙일 것
		double var8=0.05;	//소수점 선언
		
		//논리형
		boolean var9=true;	//값은 무조건 true or false, 조건식에서 많이 사용
		
		System.out.println("문자형");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(" ");
		
		System.out.println("정수형");
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(" ");
		
		System.out.println("실수형");
		System.out.println(var7);
		System.out.println(var8); //System.out.println() : 줄바꿈 포함 출력문
		System.out.println(" ");
		
		System.out.println("논리형");
		System.out.print(var9); //System.out.print() : 줄바꿈 미포함 출력문
	}

}
