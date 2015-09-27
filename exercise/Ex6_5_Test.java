package exercise;

import java.util.Scanner;


public class Ex6_5_Test {
/*	public static Ex6_5_MyPoint setData(){
		double x = 0;
		double y = 0;	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please input x: ");
		x = sc.nextDouble();
		System.out.printf("Please input y: ");
		y = sc.nextDouble();
		Ex6_5_MyPoint p = new Ex6_5_MyPoint(x,y);
		sc.close();	
		return p;
	}
	*/
	
	public static void main(String[] args) {
		double x = 0;
		double y = 0;	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please input x: ");
		x = sc.nextDouble();
		System.out.printf("Please input y: ");
		y = sc.nextDouble();
		Ex6_5_MyPoint p1 = new Ex6_5_MyPoint(x,y);
		
		System.out.printf("Please input x: ");
		x = sc.nextDouble();
		System.out.printf("Please input y: ");
		y = sc.nextDouble();
		Ex6_5_MyPoint p2 = new Ex6_5_MyPoint(x,y);
		
		System.out.printf("the distance is %f\n", p1.distance(p2));
		System.out.printf("the distance is %f\n", p1.distance(p1,p2));
		sc.close();
	}

}
