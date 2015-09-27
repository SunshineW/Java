package exercise;

public class Ex7_4 {
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int result = 0;
		for(int i=0; i<args.length; i++){
			result += Integer.parseInt(args[i]);
		}
		System.out.printf("the sum of args is %d\n", result);
	}

}
