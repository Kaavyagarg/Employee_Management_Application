package functionality;

import java.util.*;
import java.time.LocalDate;

public class Employee {
	//	public ArrayList<Employee> employees = new ArrayList<>();
		private static int nextEmpId = 1;
	    private int empId;
	    private String name;
	    private LocalDate dateOfJoining;
	    private String phoneNumber;
	    private String aadhaarNumber;
		public Employee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber) {
			//super();
			this.empId =nextEmpId++;
			//this.empId = empId;
			this.name = name;
			this.dateOfJoining = dateOfJoining;
			this.phoneNumber = phoneNumber;
			this.aadhaarNumber = aadhaarNumber;
			
		}
		public int getEmpId() {
			return empId;
		}

		public String getName() {
			return name;
		}

		public LocalDate getDateOfJoining() {
			return dateOfJoining;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String getAadhaarNumber() {
			return aadhaarNumber;
		}
		@Override
		 public String toString() {
		     return "Emp ID: " + empId + "\nName of Employee: " + name + "\n Date of joining" +dateOfJoining
		             + "\n Phone number: " + phoneNumber + "\nAadhar number : " + aadhaarNumber ;
		 
	}
}