package exercise;

public class Ex4_4 {

	public static void printMatrix(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(1 + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args){
		printMatrix(5);
	}
}
