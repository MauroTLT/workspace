package Composite;

public class EjemploComposite {
	public static void main(String[] args) {
		Empleado emp1 = new Developer("John", 10000);
		Empleado emp2 = new Developer("David", 15000);
		Empleado manager1 = new Manager("Daniel", 25000);
		manager1.add(emp1);
		manager1.add(emp2);
		Empleado emp3 = new Developer("Michael", 20000);
		Manager generalManager = new Manager("Mark", 50000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}
}