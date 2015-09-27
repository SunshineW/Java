package exercise;

public class Ex8_6_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ex8_6_Employee alice1 = new Ex8_6_Employee("Alice Adams", 75000, 1987, 12, 15);
		Ex8_6_Employee alice2 = alice1;
		Ex8_6_Employee alice3 = new Ex8_6_Employee("Alice Adams", 75000, 1987, 12, 15);
		Ex8_6_Employee bob = new Ex8_6_Employee("Bob Brandson", 50000, 1989, 10, 1);
		
		System.out.println("alice1 = alice2: " + (alice1 == alice2));
		System.out.println("alice1 = alice3: " + (alice1 == alice3));
		System.out.println("alice1.equals(alice3): "+ alice1.equals(alice3));
		System.out.println("alice1.equals(bob): "+ alice1.equals(bob));
		
		System.out.println("bob.toString(): " + bob);
		
		Ex8_6_Manager carl = new Ex8_6_Manager("Cral Cracker", 80000, 1987, 12, 15);
		Ex8_6_Manager boss = new Ex8_6_Manager("Cral Cracker", 80000, 1987, 12, 15);
		boss.setBons(5000);
		System.out.println("boss.toString(): " + boss);
		System.out.println("carl.euqals(boss): " + carl.equals(boss));
		
		Ex8_6_Person[] person = new Ex8_6_Person[]{alice1, alice2, alice3, bob, carl, boss};
		for(int i=0; i<person.length; i++){
			System.out.println(person[i].getDescription());
		}
		
	}

}
