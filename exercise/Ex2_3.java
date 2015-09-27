package exercise;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a char(A~Z): ");
		String s = sc.next();
		System.out.println(s.toLowerCase());
		sc.close();
	}
}
