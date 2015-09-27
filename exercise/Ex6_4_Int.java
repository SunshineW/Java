package exercise;

public class Ex6_4_Int {

	private int value;

	public Ex6_4_Int(){
		this.value = 0;
	}
	public Ex6_4_Int(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isPrime() {
		for (int i=2; i<this.value; i++){
			if (this.value % i == 0){
				return false;
			}
		}
		return true;	
	}
	public boolean isPrime(int n) {
		this.value = n;
		for (int i=2; i<this.value; i++){
			if (this.value % i == 0){
				return false;
			}
		}
		return true;	
	}
	
	public boolean isEven(){
		if (this.value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}	
	public boolean isEven(int n){
		this.value = n;
		if (this.value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex6_4_Int other = (Ex6_4_Int) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
}
