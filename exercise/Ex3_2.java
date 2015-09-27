package exercise;

import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 6 == 0)
		{
			System.out.println(num + " divisible by both 5 and 6\n");
		}

		else if (num % 5 == 0 || num % 6 == 0)
		{
			System.out.println(num + " is divisible by 5 or 6, but not both\n");
		}

		else if(num % 5 != 0 || num % 6 != 0)
		{
			System.out.println(num + " is not divisible by either 5 or 6\n");
		}
		sc.close();
	}
}
