
package oops;


class Employee{
	void calculatesalary() {
		System.out.println("salary calculated");
	}
}

class Manager extends Employee{
	void calculatesalary() {
		System.out.println("base pay 30000 and bomus 5000");
	}
}

class Developer extends Employee{
	void calculatesalary() {
		System.out.println("base pay 90000 and bonus 20000");
	}
}

class Intern extends Employee{
	void calculatesalary() {
		System.out.println("base pay 16000 and bonus 2000");
	}
}

public class Mainbank {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		emp[0]=new Manager();
		emp[1]=new Developer();
		emp[2]=new Intern();
		
		for(Employee e : emp) {
			e.calculatesalary();
		}
		

	}

}
