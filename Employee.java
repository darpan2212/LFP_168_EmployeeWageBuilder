public class Employee {

	public static void main(String[] args) {
		final int PRESENT = 1;
		int isEmpPresent = (int)(Math.random() * 2);
		System.out.println(isEmpPresent);
		
		if (isEmpPresent == PRESENT) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}
	
}