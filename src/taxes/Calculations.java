package taxes;

public class Calculations {
	
	public static double calculateAdvance(double advanceTaxOffice, double advanceTax, double t_health2, double exemptedValue ) {
		advanceTaxOffice = advanceTax - t_health2 - exemptedValue;
		return advanceTaxOffice;
	}

	public static double calculateBasis(double advanceTax, double basis) {
		advanceTax = (basis * 18) / 100;
		return advanceTax;
	}

	public static double colculatedBasis(double t_pension, double t_disabled, double s_illness, double basis) {
		t_pension = (basis * 9.76) / 100;
		t_disabled = (basis * 1.5) / 100;
		s_illness = (basis * 2.45) / 100;
		return (basis - t_pension - t_disabled - s_illness);
	}
	
	public static double colculatedT_pension(double t_pension, double basis) {
		t_pension = (basis * 9.76) / 100;
		return t_pension;
	}
	public static double colculatedT_disabled(double t_disabled, double basis) {
		t_disabled = (basis * 1.5) / 100;
		return t_disabled;
	}
	public static double colculatedS_illness(double s_illness, double basis) {
		s_illness = (basis * 2.45) / 100;
		return s_illness;
	}

	public static double calculateInsuranceH1(double t_health1, double basis) {
		t_health1 = (basis * 9) / 100;
		return t_health1;
	}
	public static double calculateInsuranceH2(double t_health2, double basis) {
		t_health2 = (basis * 7.75) / 100;
		return t_health2;
	}
}
