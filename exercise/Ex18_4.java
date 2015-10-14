package exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex18_4 {

	public static void addNumbersToCollection(Collection<Integer> collection) throws Exception {
		System.out.println("请输入一行整数");
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		String lineString = sin.readLine();
		String[] arrStrings = lineString.split(" ");
		for(int i=0; i<arrStrings.length;i++)
		{
			if(arrStrings[i].equals(""))//输入的串中有连续空格的话，会产生空串
			{
				continue;
			}
			try {
				collection.add(Integer.parseInt(arrStrings[i]));
			} catch (NumberFormatException e) {
				System.out.println("输入错误，只能输入整数！");
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) throws Exception {

		LinkedList<Integer> linkedList = new LinkedList<Integer>(); //存放录入的数字
		HashSet<Integer> hashSet = new HashSet<Integer>(); //存放出现次数最多的数字
		
		addNumbersToCollection(linkedList);
		Integer[] arr = (Integer[]) linkedList.toArray(new Integer[linkedList.size()]);
		
		Arrays.sort(arr);
		//排序后的数组相同的值紧挨着，很容易计算每个单词出现的次数， 根据单词出现的次数， 更新集合中的值或者添加数据到集合
		int count = 1;  
		int maxCount = 0;
		for(int i=1; i<arr.length; i++) 
		{
			if(arr[i].equals(arr[i-1]))
			{
				count++;
			}
			if( !arr[i].equals(arr[i-1]) || i == arr.length - 1)
			{
				if (maxCount < count ) 
				{
					hashSet.clear();
					hashSet.add(arr[i-1]);
					maxCount = count;
				}
				if (maxCount == count )
				{
					hashSet.add(arr[i-1]);
				}
				count = 1;
			}
		}
		System.out.print("出现次数最多的数字是： ");
		System.out.print(hashSet);
	}

}
