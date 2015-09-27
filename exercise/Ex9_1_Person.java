package exercise;

public class Ex9_1_Person implements Comparable<Object>{
	private Ex9_1_Name name;

	public Ex9_1_Person(Ex9_1_Name name) {
		this.name = name;
	}
	public Ex9_1_Name getName() {
		return name;
	}
	public void setName(Ex9_1_Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ex9_1_Person [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return name.getFullName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex9_1_Person other = (Ex9_1_Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Object p) {
		Ex9_1_Person pp = new Ex9_1_Person(null);
		if (p instanceof Ex9_1_Person){
			pp  = (Ex9_1_Person) p;
		}
		/* Last name, first name, middle name */
		if(!(pp.name.getLastName().equals(this.name.getLastName()))){
			return pp.name.getLastName().compareTo(this.name.getLastName());
		}
		else if (!(pp.name.getFirstName().equals(this.name.getFirstName()))){
			return pp.name.getFirstName().compareTo(this.name.getFirstName());
		}
		else {
			return (int)(pp.name.getMi() - this.name.getMi());
		}
	}	
}
