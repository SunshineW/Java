package exercise;

import java.util.Scanner;

public class Ex7_2 {

	private static int parseBinary(String binaryString){
		int result = 0;
		char c=0;
		for(int i=0; i<binaryString.length(); i++){
			c = binaryString.charAt(i);
			if (c == '0'){
				continue;
			}
			else if(c == '1'){
				result += Math.pow(2, binaryString.length()- i - 1);
			}
			else{
				return -1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a binary string: ");
		int num = parseBinary(sc.next());
		if (num == -1){
			System.out.print("bad binary string!\n");
		}
		else{
				System.out.printf("the num is %d\n", num);
		}
		sc.close();
	
	}

}
