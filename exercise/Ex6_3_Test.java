package exercise;

import java.util.Scanner;

public class Ex6_3_Test {


	private static Ex6_3_Candidate[] can;
	private static Ex6_3_Vote[] vote;
	
	public static void voteMenu(){
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("       1.zhang");
		System.out.println("       2.wang");
		System.out.println("       3.li");
		System.out.println("~~~~~~~~~~~~~~~~~~~");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vote = new Ex6_3_Vote[]{new Ex6_3_Vote(),new Ex6_3_Vote(),new Ex6_3_Vote()};
		can = new Ex6_3_Candidate[]{
				new Ex6_3_Candidate("zhang",vote[0]),
				new Ex6_3_Candidate("wang", vote[1]),
				new Ex6_3_Candidate("li", vote[2])};
		voteMenu();	
		for(int i=0; i<5; i++){
			System.out.print("Please choose(1~3): ");
			int choose = sc.nextInt();
			if (choose>=1 && choose <=3){	
				can[choose-1].getVote().increment();
			}
			else {
				System.out.printf("vote failed\n");
			}
		}
		System.out.printf("final status:\n");
		for (int i=0; i<3; i++)
		System.out.print(can[i]);
		sc.close();
		
	}

}
