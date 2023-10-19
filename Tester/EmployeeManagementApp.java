package Tester;
import functionality.Employee;
import functionality.FullTimeEmployee.*;
import functionality.PartTimeEmployee.*;
import static functionality.methods.*;
import java.util.*;
import java.time.LocalDate;
public class EmployeeManagementApp {
public static void main(String[] args) {
	ArrayList<Employee> employees = new ArrayList<>();
	//Employee ema1 = new Employee();
	final int nextEmpId;
	Scanner scanner = new Scanner(System.in);
	while(true)
	{	
		System.out.println("\nEmployee Management Application");
        System.out.println("1. Add Full Time Employee");
        System.out.println("2. Add Part Time Employee");
        System.out.println("3. Delete Employee by Emp Id");
        System.out.println("4. Search Employee by Aadhaar Number");
        System.out.println("5. Display All Employee Details");
        System.out.println("6. Display All Employee Details Sorted by Date of Joining");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");

		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			addFullTimeEmployee(scanner,employees);
		                    break;
        case 2:
        	addPartTimeEmployee(scanner,employees);
            break;
        case 3:
         deleteEmployee(scanner,employees);
            break;
        case 4:
            searchEmployeeByAadhaar(scanner,employees);
            break;
        case 5:
          displayAllEmployeeDetails(employees);
            break;
        case 6:
            displayAllEmployeeDetailsSortedByDateOfJoining(employees);
            break;
        case 7:
            System.out.println("Exiting the application.");
            scanner.close();
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please enter a valid option.");
		}
	}
}
}
 