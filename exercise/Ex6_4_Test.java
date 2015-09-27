package exercise;

import java.util.Scanner;


public class Ex6_4_Test {

	public static void  Test(Ex6_4_Int obj) {
		if (obj.isPrime()){
		System.out.printf("%d is a prime number\n", obj.getValue());
		}
		else {
			System.out.printf("%d is not a prime number\n", obj.getValue());
		}	
		if (obj.isEven()){
			System.out.printf("%d is a even number\n", obj.getValue());
		}		
		else {
			System.out.printf("%d is not a even number\n", obj.getValue());
		}
	}
		
	public static void Test(Ex6_4_Int obj, int n){
		if (obj.isPrime(n)){
		System.out.printf("%d is a prime number\n", obj.getValue());
		}
		else {
			System.out.printf("%d is not a prime number\n", obj.getValue());
		}	
		if (obj.isEven(n)){
			System.out.printf("%d is a even number\n", obj.getValue());
		}		
		else {
			System.out.printf("%d is not a even number\n", obj.getValue());
		}
	}
		
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please input a num: ");
		int input = sc.nextInt();
		Ex6_4_Int int1 = new Ex6_4_Int(input);
		Test(int1);
		
		System.out.printf("Please input another number: ");	
		input = sc.nextInt();
		Ex6_4_Int int2 = new Ex6_4_Int();
		Test(int2, input);
		
		if(int1.equals(int2)){
			System.out.printf("%d is equals %d\n", int1.getValue(), int2.getValue());
		}
		else {
			System.out.printf("%d is not equals %d\n", int1.getValue(), int2.getValue());
		}
		sc.close();
	}

}
