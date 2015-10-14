package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex18_3 {


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

	public static void addToLinkedList(String fileName, Collection<String> collection) throws IOException{

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
				collection.add(arrStrings[i]);
			}
		}
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {

		Collection<String> hashSet = new HashSet<String>();
		Collection<String> linkedList = new LinkedList<String>();
		String fileName = new String("lalal.txt");
		
		writeToFile(fileName);
		
		addToLinkedList(fileName, hashSet); //将文本中单词加入到HashSet集合中， 然后升序不重复输出
		String[] arrStrings = (String[]) hashSet.toArray(new String[hashSet.size()]);
		Arrays.sort(arrStrings);
		System.out.println("升序重复输出");
		for(int i=0; i<arrStrings.length;i++)
		{
			System.out.println(arrStrings[i]);
		}
		
		addToLinkedList(fileName, linkedList);//将文本中单词加入到linkedList集合中， 然后升序重复输出
		String[] arrStrings2 = (String[]) linkedList.toArray(new String[linkedList.size()]);
		Arrays.sort(arrStrings2);
		System.out.println("升序重复输入");
		for(int i = 0;i<arrStrings2.length;i++)
		{
			System.out.println(arrStrings2[i]);
		}
	}
}
