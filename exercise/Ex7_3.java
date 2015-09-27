package exercise;

import java.util.Scanner;

public class Ex7_3 {

	public static String convertDecimalToBinary(int value){
		return Integer.toBinaryString(value);
/*		char[] buf = new char[32];
		int i = 32;
		while(value > 0){
			if(value % 2 == 1){			
				buf[--i] = '1';
			}
			else{
				buf[--i] = '0';
			}
			value >>= 1;
		}
		return new String(buf, i, (32 -i));		*/
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a num: ");
		int num = sc.nextInt();
		System.out.print(convertDecimalToBinary(num));
		sc.close();
	}

}
