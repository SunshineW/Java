package exercise;

import java.sql.Date;

public class Ex8_6_Employee extends Ex8_6_Person {

	private Date hireDate;
	private Double salary;

	@SuppressWarnings("deprecation")
	public Ex8_6_Employee(String name, double salary, int year, int month, int day) {
		hireDate = new Date(year - 1900, month - 1, day);
		this.salary = salary;
		this.setName(name);
	}
	
	public String getDescription() {
		return getName() + ", an employee with a salary of $" + this.getSalary();
	}
	public Date getHireDate() {
		return hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	
	public void raiseDalary(double raise){
		this.salary += raise;
	}
	@Override
	public String toString() {
		return "Employee [name = "+ this.getName()
				+ ", salary = " + this.salary
				+ ", hireDay = "+ this.hireDate+ " ]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		Ex8_6_Employee other = (Ex8_6_Employee) obj;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
}
