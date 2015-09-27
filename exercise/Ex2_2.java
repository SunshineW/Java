package exercise;

import java.util.Scanner;

public class Ex2_2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please int a ASCII¡¡number (0~127): ");
		int ascii = sc.nextInt();
		char ch = (char)ascii;
		System.out.println("ASCII to char is " + ch);
		sc.close();
	}
}
