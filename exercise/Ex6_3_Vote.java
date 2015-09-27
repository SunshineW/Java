package exercise;

public class Ex6_3_Vote {
	
	private int count;

	public Ex6_3_Vote() {
		this.count = 0;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void clear(){
		this.count = 0;
	}
	
	public void increment(){
		this.count++;
	}
	
	public void decrement(){
		this.count--;
	}
}
