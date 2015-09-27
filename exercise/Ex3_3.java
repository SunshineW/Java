package exercise;

public class Ex3_3 {
	
	public static int Func(int num){	
		if (num % 5 == 0 && num % 6 == 0)
		{
			System.out.print(num + " ");
			return 0;
		}
		return -1;
	}

	public static void main(String[] args){
		int count = 0;
		for (int i=100; i<1000; i++)
		{
			if(Func(i) == 0)
			{
				count++;
				if(count % 10 == 0)
				{
					System.out.print("\n");
				}
			}
		}
	}
}
