package exercise;

public class Ex8_6_Manager extends Ex8_6_Employee {

	private double bons;

	public Ex8_6_Manager(String name, double salary, int year, int month,
			int day) {
		super(name, salary, year, month, day);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String getDescription() {
		return getName() + ", an manager with a salary of $" + (this.getSalary() + this.bons);
	}

	public void setBons(double bons) {
		this.bons = bons;
	}

	@Override
	public String toString() {
		return "Manager [name = "+ this.getName()
				+ ", salary = " + this.getSalary()
				+ ", hireDay = " + this.getHireDate()
				+ ", bones = " + bons + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bons);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex8_6_Manager other = (Ex8_6_Manager) obj;
		if (Double.doubleToLongBits(bons) != Double
				.doubleToLongBits(other.bons))
			return false;
		return true;
	}
	
	
}
