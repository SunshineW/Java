package exercise;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex7_1 {
	public static int countLetter(String s){
		int count = 0;
		for (int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') ||( c >= 'A' && c <= 'Z')){
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args){
		System.out.printf("Please input string: ");
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		try {
			count = countLetter(sin.readLine());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.printf("the string hs %d letters",count );
	}
}
