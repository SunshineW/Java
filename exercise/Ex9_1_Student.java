package exercise;

public class Ex9_1_Student extends Ex9_1_Person{

	private String  major;
	
	public Ex9_1_Student(Ex9_1_Name name) {
		super(name);
	}
	public Ex9_1_Student(Ex9_1_Name name, String major) {
		super(name);
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	@Override
	public int hashCode() {
		return super.hashCode() + major.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex9_1_Student other = (Ex9_1_Student) obj;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		return true;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return this.getName().getFirstName()
				+ " " + this.getName().getMi()
				+ " " + this.getName().getLastName() 
				+ ", Major: " + major;
	}
	@Override
	public int compareTo(Object p) {
		Ex9_1_Student pp = null;
		if (p instanceof Ex9_1_Person){
			pp  = (Ex9_1_Student) p;
		}

		/* Major, last name, first name, middle name */
		if (!(pp.getMajor().equals(this.getMajor()))){
			return pp.getMajor().compareTo(this.getMajor());
		}
		else {
			return super.compareTo(pp);
		}
	}
}
