package exercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex18_4 {

	public static void addNumbersToCollection(Collection<Integer> collection) throws Exception {
		System.out.println("������һ������");
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		String lineString = sin.readLine();
		String[] arrStrings = lineString.split(" ");
		for(int i=0; i<arrStrings.length;i++)
		{
			if(arrStrings[i].equals(""))//����Ĵ����������ո�Ļ���������մ�
			{
				continue;
			}
			try {
				collection.add(Integer.parseInt(arrStrings[i]));
			} catch (NumberFormatException e) {
				System.out.println("�������ֻ������������");
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) throws Exception {

		LinkedList<Integer> linkedList = new LinkedList<Integer>(); //���¼�������
		HashSet<Integer> hashSet = new HashSet<Integer>(); //��ų��ִ�����������
		
		addNumbersToCollection(linkedList);
		Integer[] arr = (Integer[]) linkedList.toArray(new Integer[linkedList.size()]);
		
		Arrays.sort(arr);
		//������������ͬ��ֵ�����ţ������׼���ÿ�����ʳ��ֵĴ����� ���ݵ��ʳ��ֵĴ����� ���¼����е�ֵ����������ݵ�����
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
		System.out.print("���ִ������������ǣ� ");
		System.out.print(hashSet);
	}

}
