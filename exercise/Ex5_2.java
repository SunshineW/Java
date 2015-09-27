package exercise;

import java.util.Random;

public class Ex5_2 {

	public static void main(String[] args){
		int[] a = new int[100];
		int[] count = new int[10];
		for(int i=0; i<10; i++){
			count[i] = 0;
		}
		Random random = new Random();
		for(int i=0; i<100; i++){
			if (i % 20 == 0){
				System.out.printf("\n");
			}
			a[i] = random.nextInt(10);
			count[a[i]]++;		
			System.out.printf(a[i]+ " ");
			
		}
		System.out.printf("\n");
		for(int i=0; i<10; i++){
			if(count[i] != 0){
				System.out.printf("Count for %d is %d\n", i, count[i]);
			}
		}
	}
}
