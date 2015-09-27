package exercise;

import java.util.Random;
import java.util.Scanner;

public class Ex5_4 {

	public static int[][] creatMatrix(int n){
		int[][] matrix = new int[n][n];
		
		Random random = new Random();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = random.nextInt(10);
			}
		}
		return matrix;
	}
	
	public static void showMatric(int[][] matric, int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.printf("%d ", matric[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.printf("Please input the length or wight of the matric: ");
		int n = sc.nextInt();
		int[][] matric = creatMatrix(n);
		showMatric(matric, n);
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += matric[i][i];
		}
		System.out.printf("the sum of numbers on the Diagonal is %d\n", sum);
		
		sc.close();
	}
}
