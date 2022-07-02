public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int FULL_TIME = 8;
		final int WAGE_PER_HOUR = 20;	
		int isEmpPresent = (int)(Math.random() * 3);
		int empHr;
	
		System.out.println(isEmpPresent);
		
		if (isEmpPresent == PRESENT) {
			System.out.println("Employee is present");
			empHr = FULL_TIME;
		} else if(isEmpPresent == PART_TIME) {
			System.out.println("Employee is working part-time");
			empHr = FULL_TIME/2;
		} else {
			System.out.println("Employee is absent");
			empHr = 0;
		}
		int empWage = empHr * WAGE_PER_HOUR;
		System.out.println("Employee Wage : $"+empWage+" USD");
	}
	
}