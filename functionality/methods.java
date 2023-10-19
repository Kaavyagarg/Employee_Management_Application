package functionality;
import functionality.Employee;
import functionality.FullTimeEmployee;
import functionality.PartTimeEmployee;
import Tester.EmployeeManagementApp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class methods {
	public static void addFullTimeEmployee(Scanner scanner,ArrayList<Employee> employees) 
	{
        System.out.print("Enter the employee name: ");
        String name = scanner.next();

        System.out.print("Enter the employee's phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter the employee's Aadhaar number: ");
        String aadhaarNumber = scanner.next();

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        LocalDate dateOfJoining = getValidDateOfJoining(scanner,employees);

        FullTimeEmployee fte = new FullTimeEmployee(name, dateOfJoining, phoneNumber, aadhaarNumber, monthlySalary);
        employees.add(fte);
//        nextEmpId++;

        System.out.println("Full Time Employee added successfully with Emp Id: " + fte.getEmpId());
    }

    public static void addPartTimeEmployee(Scanner scanner,ArrayList<Employee> employees) 
    {
        System.out.print("Enter the employee name: ");
        String name = scanner.next();

        System.out.print("Enter the employee's phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter the employee's Aadhaar number: ");
        String aadhaarNumber = scanner.next();

        System.out.print("Enter the hourly payment: ");
        double hourlyPayment = scanner.nextDouble();

        LocalDate dateOfJoining = getValidDateOfJoining(scanner,employees);

        PartTimeEmployee pte = new PartTimeEmployee( name, dateOfJoining, phoneNumber, aadhaarNumber, hourlyPayment);
        employees.add(pte);
//        nextEmpId++;

        System.out.println("Part Time Employee added successfully with Emp Id: " + pte.getEmpId());
    }

    public static LocalDate getValidDateOfJoining(Scanner scanner,ArrayList<Employee> employees) 
    {
        LocalDate dateOfJoining = null;
        while (dateOfJoining == null) 
        {
            System.out.print("Enter the date of joining (YYYY-MM-DD): ");
            String input = scanner.next();
            try 
            {
                dateOfJoining = LocalDate.parse(input);
            } 
            catch (Exception e) 
            {
                System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
            }
        }
        return dateOfJoining;
    }

    public static void deleteEmployee(Scanner scanner,ArrayList<Employee> employees) 
    {
        System.out.print("Enter the Emp Id of the employee to delete: ");
        int empIdToDelete = scanner.nextInt();
        boolean removed = false;

        for (Employee employee : employees) 
        {
            if (employee.getEmpId() == empIdToDelete) 
            {
                employees.remove(employee);
                System.out.println("Employee with Emp Id " + empIdToDelete + " deleted.");
                removed = true;
                break;
            }
        }

        if (!removed) 
        {
            System.out.println("Employee with Emp Id " + empIdToDelete + " not found.");
        }
    }

    public static void searchEmployeeByAadhaar(Scanner scanner,ArrayList<Employee> employees)
    {
        System.out.print("Enter the Aadhaar number to search: ");
        String aadhaarToSearch = scanner.next();
        boolean found = false;

        for (Employee employee : employees) 
        {
            if (employee.getAadhaarNumber().equals(aadhaarToSearch)) 
            {
                printEmployeeDetails(employee);
                found = true;
            }
        }

        if (!found) 
        {
            System.out.println("Employee with Aadhaar number " + aadhaarToSearch + " not found.");
        }
    }

    public static void displayAllEmployeeDetails(ArrayList<Employee> employees) 
    {
        System.out.println("\nAll Employee Details:");
        for (Employee employee : employees) 
        {
            printEmployeeDetails(employee);
        }
    }

    public static void displayAllEmployeeDetailsSortedByDateOfJoining(ArrayList<Employee> employees) 
    {
        Collections.sort(employees, (e1, e2) -> e1.getDateOfJoining().compareTo(e2.getDateOfJoining()));
        System.out.println("\nAll Employee Details Sorted by Date of Joining:");
        for (Employee employee : employees)
        {
            printEmployeeDetails(employee);
        }
    }

    public static void printEmployeeDetails(Employee employee) 
    {
        System.out.println("\nEmp Id: " + employee.getEmpId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Date of Joining: " + employee.getDateOfJoining());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Aadhaar Number: " + employee.getAadhaarNumber());

        if (employee instanceof FullTimeEmployee) 
        {
            FullTimeEmployee fte = (FullTimeEmployee) employee;
            System.out.println("Monthly Salary: $" + fte.getMonthlySalary());
        } 
        else if (employee instanceof PartTimeEmployee)
        {
            PartTimeEmployee pte = (PartTimeEmployee) employee;
            System.out.println("Hourly Payment: $" + pte.getHourlyPayment());
        }
    }
}
