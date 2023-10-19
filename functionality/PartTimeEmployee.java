package functionality;
import java.util.*;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
 public class PartTimeEmployee extends Employee{
	 private double hourlyPayment;

	public PartTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String aadhaarNumber,
			double hourlyPayment)
	{
		super(name, dateOfJoining, phoneNumber, aadhaarNumber);
		this.hourlyPayment = hourlyPayment;
	}

	public double getHourlyPayment() 
	{
		return hourlyPayment;
	}
	@Override
	 public String toString() {
	     return super.toString()+ "\n Hourly salary : " + hourlyPayment ;
	} 
 }

