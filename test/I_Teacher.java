package test;

public class I_Teacher implements I_Painter , I_Singer {

	private String name;
	
	public I_Teacher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void sing() {
		// TODO 自动生成的方法存根
		System.out.println("teacher is sing");
		
	}

	@Override
	public void sleep() {
		// TODO 自动生成的方法存根
		System.out.println("teacher is sleep");
	}

	@Override
	public void paint() {
		// TODO 自动生成的方法存根
		System.out.println("teacher is paint");
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("teacher is eat");
	}

}
