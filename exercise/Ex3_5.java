package exercise;

public class Ex3_5 {

	public static void main(String[] args){
		
		float result = 0;
		for(int i=1;i<=97; i=i+2)
		{
			result += (float)i / (i+2);
		}
		System.out.print("1/3 + 3/5 + 5/7 + ... + 97/99 = " + result);
	}
}
