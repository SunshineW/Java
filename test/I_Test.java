package test;

public class I_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		I_Singer p1 = new I_Student("Alice");
		I_Singer p2 = new I_Teacher("Jim");
		p1.sing();
		p2.sing();
		I_Painter p3 = (I_Painter)p2;
		
		p3.paint();
		
	}

}
