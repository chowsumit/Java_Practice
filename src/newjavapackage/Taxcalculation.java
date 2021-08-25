package newjavapackage;

import java.util.Scanner;

public class Taxcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the per hour income : ");
		String strhrIncome = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the total hour : ");
		String strTotalHour = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the percentage of tax : ");
		String strTaxPercent = sc3.nextLine();		
		
		double hrIncome = Double.parseDouble(strhrIncome);
		double totalHour = Double.parseDouble(strTotalHour);
		double tax = Double.parseDouble(strTaxPercent);
		
		double totalIncome = hrIncome * totalHour;
		double incomeAfterTax = totalIncome*(100-tax)/100;
		
		System.out.println("Total income before tax : "+totalIncome);
		System.out.println("Income after tax : "+incomeAfterTax);
		
		
		
	}

}
