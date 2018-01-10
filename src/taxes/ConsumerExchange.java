package taxes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsumerExchange {

	public static double income = 0;
	public static char contractType = ' ';
	
	public ConsumerExchange() throws NumberFormatException, IOException {
		
	}
	
	public double amountOfMoney() throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Provide income: ");	
		income = Double.parseDouble(br.readLine());
		return income;
	}
	
	public char typeOfAccount() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Contract type: (O)rdinary, (C)ivil: ");
		contractType = br.readLine().charAt(0);
		return contractType;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		ConsumerExchange.income = income;
	}

	public char getContractType() {
		return contractType;
	}

	public void setContractType(char contractType) {
		ConsumerExchange.contractType = contractType;
	}
	
	
}
