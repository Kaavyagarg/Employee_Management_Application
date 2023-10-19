package functionality;

import java.util.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee( String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
			double monthlySalary) 
	{
		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}
	@Override
	 public String toString() {
	     return super.toString()+ "\n Monthly salary : " + monthlySalary ;
	} 
}
