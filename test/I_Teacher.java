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
		// TODO �Զ����ɵķ������
		System.out.println("teacher is sing");
		
	}

	@Override
	public void sleep() {
		// TODO �Զ����ɵķ������
		System.out.println("teacher is sleep");
	}

	@Override
	public void paint() {
		// TODO �Զ����ɵķ������
		System.out.println("teacher is paint");
	}

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("teacher is eat");
	}

}
