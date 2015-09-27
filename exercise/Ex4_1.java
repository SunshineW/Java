
package exercise;

import java.util.Scanner;

public class Ex4_1 {

	public static int sumDigits(long n){
		int result = 0;
		while(n != 0){
			result += n % 10;
			n /= 10;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.print("Please input a number: ");
		Scanner sc = new Scanner(System.in);
		int result = sumDigits(sc.nextLong());
		System.out.print("the result is " + result);
		sc.close();
	}
}
