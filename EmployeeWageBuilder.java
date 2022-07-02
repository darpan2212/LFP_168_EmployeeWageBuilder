public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int FULL_TIME = 8;
		final int WAGE_PER_HOUR = 20;	
		final int WORKING_DAYS = 20;
		
		int totalSalary = 0;
		
		for (int day=0;day<WORKING_DAYS;day++) {
			int isEmpPresent = (int)(Math.random() * 3);
			int empHr;
	
			//System.out.println(isEmpPresent);	
			
			switch(isEmpPresent) {
		
				case PRESENT :
					//System.out.println("Employee is present");
					empHr = FULL_TIME;	
				break;
			
				case PART_TIME :
					//System.out.println("Employee is working part-time");
					empHr = FULL_TIME/2;
				break;
				
				default :
					//System.out.println("Employee is absent");
					empHr = 0;
				break;
		
			}
			
			int empWage = empHr * WAGE_PER_HOUR;
			totalSalary = totalSalary + empWage;
			//System.out.println("Employee Wage : $"+empWage+" USD");
			//System.out.println("<------------------------------->");
		}
		System.out.println("Employee monthly salary : $"+totalSalary+" USD");
	}
	
}