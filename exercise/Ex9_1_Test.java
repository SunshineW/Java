package exercise;

import java.util.Arrays;

public class Ex9_1_Test {

	static Ex9_1_Student[] s = new Ex9_1_Student[3];
	public static void printList(Ex9_1_Student[] s){
		for (int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	public static void sort(Ex9_1_Student[] s){
		Arrays.sort(s);
	}

	public static Ex9_1_Student max(Ex9_1_Student[] s){
		Ex9_1_Student[] ss = new Ex9_1_Student[s.length];
		ss = s;
		Arrays.sort(ss);
		return ss[0];
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		s[0] = new Ex9_1_Student(new Ex9_1_Name("Derek", 'S', "Dexony"),"Math");
		s[1] = new Ex9_1_Student(new Ex9_1_Name("Stack", 'S', "Waters"),"Math");
		s[2] = new Ex9_1_Student(new Ex9_1_Name("Adamo", 'U', "Leetmz"),"P.E.");
		
		printList(s);
		System.out.println();
		
		System.out.println("Max is: " + max(s));
		System.out.println();
		
		sort(s);
		printList(s);
		System.out.println();
	}

}
