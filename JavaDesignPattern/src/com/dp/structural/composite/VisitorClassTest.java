package com.dp.structural.composite;

public class VisitorClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeAssociate e = new EmployeeAssociate("Kavin", 25);
		EmployeeAssociate kowshi = new EmployeeAssociate("Kowshi", 22);
		
		EmployeeSeniorAssociate sa = new EmployeeSeniorAssociate("Jagadeesh", 32);
		sa.addEmployees(e);
		sa.addEmployees(kowshi);
		
		System.out.println("******************************* Printing Employee Details - 1 ************************");
		e.printDetail();
		e.printReportees();
		
		System.out.println("******************************* Printing Employee Details - 2 ************************");
		kowshi.printDetail();
		kowshi.printReportees();
		
		System.out.println("******************************* Printing Team Lead Details ************************");
		sa.printDetail();
		sa.printReportees();
	}

}
