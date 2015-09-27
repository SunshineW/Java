package exercise;

import java.util.Scanner;

public class Ex6_1_Test {
	private static Ex6_1_Fan fan;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	//	System.out.printf("Please input the speed of fan: ");
		fan.setSpeed(88);
	//	System.out.printf("Please input the radius of fan: ");
		fan.setRadius(30.2);
	//	System.out.printf("Please input the color of fan: ");
		fan.setColor("green");
	//	System.out.printf("on : ");
		fan.setOn(false);
		
		
		System.out.print(fan);
		sc.close();
		
	}

}
