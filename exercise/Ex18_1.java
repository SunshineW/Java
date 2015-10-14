package exercise;

import java.util.Collection;
import java.util.HashSet;

public class Ex18_1 {

	public static Collection<String> fun(Collection<String> a, Collection<String> b, int operator){
		//operator有四个值 1,2,3,4;代表的意义分别是
		//1:求交集; 2:求并级; 3:a-b; 4:b-a;
		Collection<String> newCollection = new HashSet<String>();
		switch (operator) {
		case 1:
			newCollection.addAll(a);
			newCollection.addAll(b);
			break;
		case 2:
			newCollection.addAll(a);
			newCollection.retainAll(b);
			break;
		case 3:
			newCollection.addAll(a);
			newCollection.removeAll(b);
			break;
		case 4:
			newCollection.addAll(b);
			newCollection.remove(a);
			break;
		default:
			newCollection = null;
			break;
		}
		return newCollection;
	}
	public static void main(String[] args) {
		String[] aStrings = new String[]{"George", "Jim",  "John", "Kevin", "Michael"};
		String[] bStrings = new String[]{"George", "Katie", "Kevin", "Michelle", "Ryan"};
		Collection<String> aCollection = new HashSet<String>();
		Collection<String> bCollection = new HashSet<String>();
		for(int i=0; i<aStrings.length;i++)
		{
			aCollection.add(aStrings[i]);
		}
		for(int i=0; i<bStrings.length; i++)
		{
			bCollection.add(bStrings[i]);
		}
		System.out.print("a: ");
		System.out.println(aCollection);
		
		System.out.print("b: ");
		System.out.println(bCollection);
		System.out.println();
		
		System.out.print("交集 : ");
		System.out.println(fun(aCollection, bCollection, 1));

		System.out.print("并集 : ");
		System.out.println(fun(aCollection, bCollection, 2));

		System.out.print("a-b: ");
		System.out.println(fun(aCollection, bCollection, 3));

		System.out.print("b-a: ");
		System.out.println(fun(aCollection, bCollection, 4));		
	}
}
