package Study_Base;

import java.util.Scanner;
public class Whatif {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String yuso=scanner.nextLine();
		
		if(yuso == "It's me!") {
			System.out.println("Yuso is me!");
		}
		else if(yuso == "It's my friend!") {
			System.out.println("Oh my dear!");
		}
		else{
			System.out.println("Haha, you don't know me!");
		}
		scanner.close();
	}
}
