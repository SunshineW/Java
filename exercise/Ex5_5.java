package exercise;

import java.util.Random;

public class Ex5_5 {
	public static int[][] creatMatrix(int n){
		int[][] matrix = new int[n][n];
		
		Random random = new Random();
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				matrix[i][j] = random.nextInt(10);
			}
		}
		return matrix;
	}
	
	public static void main(String[] agrs){
		int n = 5;
		for (int i=0; i<n; i++);
		int[][] m1 = creatMatrix(n);
		int[][] m2 = creatMatrix(n);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.printf("%d ", m1[i][j]);
			}
			
			if(i != 2){	
				System.out.printf("     ");
			}
			if(i == 2){
				System.out.printf("  +  ");
			}
			
			for(int j=0; j<n; j++){
				System.out.printf("%d ", m2[i][j]);
				
			}
			
			if(i != 2){	
				System.out.printf("     ");
			}
			if(i == 2){
				System.out.printf("  =  ");
			}
			for(int j=0; j<n; j++){
				System.out.printf("%-2d ", m1[i][j]+m2[i][j]);
			}
			
			System.out.println();
			
		}
	}
}
