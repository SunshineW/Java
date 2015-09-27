package exercise;

public class Ex5_3 {

	public static int minIndex(int[] list){
		int min = list[0];
		int minSite = 0;
		for(int i=0; i < list.length; i++){
			if (min > list[i]){
				min = list[i];
				minSite = i;
			}
		}
		return minSite;
	}
	
	public static void main(String[] args){
		int[] a = new int[]{43,2,4,3,5,2,44,12,543,4,1,9,5};
		for(int i=0; i<a.length; i++){
			System.out.printf("%d ", a[i]);
		}
		System.out.printf("\nThe min site is %d\n", minIndex(a)+1);
	}
}
