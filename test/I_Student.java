package test;

public class I_Student implements I_Singer{
	
	private String name;
	
	public I_Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void sing() {
		// TODO �Զ����ɵķ������
		System.out.println("student is sing");
	}

	@Override
	public void sleep() {
		// TODO �Զ����ɵķ������
		System.out.println("student is sleep");
	}

}
