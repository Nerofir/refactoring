package taxes;

import java.io.IOException;
import java.text.DecimalFormat;

public class TaxCalculator {
	
	public static double income = 0;
	public static char contractType = ' ';

	public static void main(String[] args) throws NumberFormatException, IOException {
		ConsumerExchange consumersData = new ConsumerExchange();
		
		income = consumersData.amountOfMoney();
		contractType = consumersData.typeOfAccount();
		
		
		DecimalFormat df00 = new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#");
		
		if(contractType == 'O') {
			Ordinary ordinaryTaxes = new Ordinary();
			ordinaryTaxes.ordinaryTaxes(df00,df,income);
			
		} else if(contractType == 'C') {
			Civil civilTaxes = new Civil();
			civilTaxes.civilTaxes(df00,df,income);
			
		} else {
			System.out.println("Unknown contract!");
		}
	}
			
}





//if (contractType == 'O') {
//	System.out.println("Ordinary contract");
//	System.out.println("basis for taxes " + income);
//	double cBasis = colculatedBasis(income);
//	System.out.println("Pension tax basis "
//			+ df00.format(t_pension));
//	System.out.println("Disability tax basis "
//			+ df00.format(t_disabled));
//	System.out.println("Illness insurance basis  "
//			+ df00.format(s_illness));
//	System.out
//			.println("Health insurance basis: "
//					+ cBasis);
//	calculateInsurance(cBasis);
//	System.out.println("Health insutance: 9% = "
//			+ df00.format(t_health1) + " 7,75% = " + df00.format(t_health2));
//	System.out.println("Constant income tax cost "
//			+ incomeCost);
//	double taxBasis = cBasis - incomeCost;
//	double taxBasis0 = Double
//			.parseDouble(df.format(taxBasis));
//	System.out.println("Tax basis " + taxBasis
//			+ " rounded " + df.format(taxBasis0));
//	calculateBasis(taxBasis0);
//	System.out.println("Advance for income tax 18 % = "
//			+ advanceTax);
//	System.out.println("Exempted value = " + exemptedValue);
//	double exemtedTax = advanceTax - exemptedValue;
//	System.out.println("Exempted tax = "
//			+ df00.format(exemtedTax));
//	calculateAdvance();
//	advanceTaxOffice0 = Double.parseDouble(df.format(advanceTaxOffice));
//	System.out.println("Advance for the tax office = "
//			+ df00.format(advanceTaxOffice) + " rounded = "
//			+ df.format(advanceTaxOffice0));
//	double salary = income
//			- ((t_pension + t_disabled + s_illness) + t_health1 + advanceTaxOffice0);
//	System.out.println();
//	System.out
//			.println("Net salary = "
//					+ df00.format(salary));
//} else if (contractType == 'C') {
//	System.out.println("CIVIL CONTRACT");
//	System.out.println("Basis for taxes " + income);
//	double oBasis = colculatedBasis(income);
//	System.out.println("Pension tax "
//			+ df00.format(t_pension));
//	System.out.println("Disability tax "
//			+ df00.format(t_disabled));
//	System.out.println("Illness insurance tax  "
//			+ df00.format(s_illness));
//	System.out
//			.println("Basis for the health tax: "
//					+ oBasis);
//	calculateInsurance(oBasis);
//	System.out.println("Healt tax: 9% = "
//			+ df00.format(t_health1) + " 7,75% = " + df00.format(t_health2));
//	exemptedValue = 0;
//	incomeCost = (oBasis * 20) / 100;
//	System.out.println("Income tax cost (constant) "
//			+ incomeCost);
//	double basisTax = oBasis - incomeCost;
//	double basisTax0 = Double.parseDouble(df.format(basisTax));
//	System.out.println("Basis tax " + basisTax
//			+ " rouded " + df.format(basisTax0));
//	calculateBasis(basisTax0);
//	System.out.println("Advance for income tax 18 % = "
//			+ advanceTax);
//	double taxTaken = advanceTax;
//	System.out.println("Tax taken = "
//			+ df00.format(taxTaken));
//	calculateAdvance();
//	advanceTaxOffice0 = Double.parseDouble(df.format(advanceTaxOffice));
//	System.out.println("Advance for tax office = "
//			+ df00.format(advanceTaxOffice) + " rounded = "
//			+ df.format(advanceTaxOffice0));
//	double salary = income
//			- ((t_pension + t_disabled + s_illness) + t_health1 + advanceTaxOffice0);
//	System.out.println();
//	System.out
//			.println("Net salary = "
//					+ df00.format(salary));
//} else {
//	System.out.println("Unknown contract!");
//}
//}
