public class EmployeeWage {



	public static final int isFullTime = 1;

	public static final int isPartTime = 2;

	public static final int empRatePerHrs = 20;

	

	public static void main(String[] args) {

	

		int empWorkHrs=0;

		int empWage=0;



		int empAttendance = (int)Math.floor(Math.random() *10)%3;

	

		switch(empAttendance){

		

		case isFullTime: 

				empWorkHrs=8;

				break;

		case isPartTime:

				empWorkHrs=4;

				break;

		default:

				empWorkHrs=0;

		}	

		

			empWage=empWorkHrs * empRatePerHrs;

			System.out.println("Employee Wage: "+empWage);

		}



}
