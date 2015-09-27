package exercise;

import java.util.Scanner;

public class Ex5_1 
{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		
		System.out.printf("Please input ten numbers\n");
		for(int i=0; i<10; i++){
			a[i] = scanner.nextInt();
		}
		
		for(int i=0; i<10; i++)
		{
			boolean flag = true;
			for(int j=0; j<i; j++){
				if (a[j] == a[i]){
					flag = false;
				}
			}
			if(flag){
				System.out.printf("%d ", a[i]);
			}
		}
		scanner.close();
	}
}
