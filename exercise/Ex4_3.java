package exercise;

public class Ex4_3 {
	
	public static void printsChars(char ch1, char ch2, int numberPerline){
		int start = (int)ch1;
		int end = (int)ch2;
		for(int i=0; i<=end-start; i++){
			if (i % numberPerline == 0){
				System.out.printf("\n");
			}
			System.out.print((char)(start + i) + " ");
		}
	}

	public static void main(String[] args){
		printsChars('!', '~', 10);
	}

}
