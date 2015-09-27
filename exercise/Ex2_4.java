package exercise;

import java.util.Scanner;

public class Ex2_4 {

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please int a number: ");
	int number = sc.nextInt();
	int result = 0;
	while(number != 0)
	{
		result += number % 10;
		number /= 10;
	}
	System.out.println("The result is " + result);
	sc.close();
	}
}
