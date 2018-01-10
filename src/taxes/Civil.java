package taxes;

import java.text.DecimalFormat;

public class Civil {
	
	public static double t_pension = 0; // 9,76% of the income
	public static double t_disabled = 0; // 1,5% of the income
	public static double s_illness = 0; // 2,45% of the income
	// health taxes
	public static double incomeCost = 111.25; 
	public static double t_health1 = 0; // 9% of the incomeCost
	public static double t_health2 = 0; // 7,75 % of the incomeCost
	public static double advanceTax = 0; // income tax (18%) advance
	public static double exemptedValue = 46.33; // reduced value 46,33 PLN
	public static double advanceTaxOffice = 0;
	public static double advanceTaxOffice0 = 0;
	
	public void civilTaxes(DecimalFormat df00, DecimalFormat df ,double income) {
		
		System.out.println("CIVIL CONTRACT");
		System.out.println("Basis for taxes " + income);
		
		double oBasis = Calculations.colculatedBasis(t_pension, t_disabled, s_illness,income);
		t_pension = Calculations.colculatedT_pension(t_pension, income);
		t_disabled = Calculations.colculatedT_disabled(t_disabled, income);
		s_illness = Calculations.colculatedS_illness(s_illness, income);
		
		System.out.println("Pension tax " + df00.format(t_pension));
		System.out.println("Disability tax " + df00.format(t_disabled));
		System.out.println("Illness insurance tax  " + df00.format(s_illness));
		System.out.println("Basis for the health tax: " + oBasis);

		t_health1 = Calculations.calculateInsuranceH1(t_health1, oBasis);
		t_health2 = Calculations.calculateInsuranceH2(t_health2, oBasis);		
		
		System.out.println("Healt tax: 9% = " + df00.format(t_health1) + " 7,75% = " + df00.format(t_health2));
		
		exemptedValue = 0;
		incomeCost = (oBasis * 20) / 100;
		
		System.out.println("Income tax cost (constant) " + incomeCost);
		double basisTax = oBasis - incomeCost;
		double basisTax0 = Double.parseDouble(df.format(basisTax));
		
		System.out.println("Basis tax " + basisTax + " rouded " + df.format(basisTax0));
		
		advanceTax = Calculations.calculateBasis(advanceTax, basisTax0);

		System.out.println("Advance for income tax 18 % = " + advanceTax);
		
		double taxTaken = advanceTax;
		
		System.out.println("Tax taken = " + df00.format(taxTaken));
		
		advanceTaxOffice = Calculations.calculateAdvance( advanceTaxOffice, advanceTax, t_health2, exemptedValue );
		advanceTaxOffice0 = Double.parseDouble(df.format(advanceTaxOffice));
		
		System.out.println("Advance for tax office = " + df00.format(advanceTaxOffice) + " rounded = " + df.format(advanceTaxOffice0));
		
		double salary = income - ((t_pension + t_disabled + s_illness) + t_health1 + advanceTaxOffice0);
		
		System.out.println();
		System.out.println("Net salary = " + df00.format(salary));
	}
}
