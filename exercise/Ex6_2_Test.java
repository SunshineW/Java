package exercise;

import java.util.Scanner;

public class Ex6_2_Test {

	private static Ex6_2_Rectangle renc;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Please input the wight: ");		
		renc.setWidth(sc.nextDouble());		
		System.out.print("Please input the hight: ");
		renc.setHeight(sc.nextDouble());		
		System.out.print("Please input the color: ");
		renc.setColor(sc.next());
		
		System.out.print(renc);
		sc.close();
	}

}
