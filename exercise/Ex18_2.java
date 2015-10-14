package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Ex18_2 {

	static HashSet<String> hashSet;
	
	public static void writeToFile(String fileName) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入数据： （按exit退出）");
		while (true)
		{
			String	string = sin.readLine();
			if (string.equalsIgnoreCase("exit")){
				break;
			}else {
				bw.write(string);
				bw.newLine();
			}
		}
		sin.close();
		bw.close();
	}

	public static void addToHashSet(String fileName, HashSet<String> hashSet) throws IOException{

		BufferedReader bw = new BufferedReader(new FileReader(fileName));
		while(true)
		{
			String string = bw.readLine();
			if (string == null)
			{
				break;
			}
			
			String[] arrStrings = string.split(" ");	
			for(int i =0; i<arrStrings.length;i++){
				if(arrStrings[i].equals(""))
				{
					continue;
				}
				hashSet.add(arrStrings[i]);
			}
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {

		hashSet = new HashSet<String>();
		String fileName = new String("lalal.txt");
		
		writeToFile(fileName);
		addToHashSet(fileName, hashSet);
		
		String[] strings= (String[]) hashSet.toArray(new String[hashSet.size()]);
		Arrays.sort(strings);
		for(int i=0; i<strings.length;i++)
		{
			System.out.println(strings[i]);
		}
	
	}
}
