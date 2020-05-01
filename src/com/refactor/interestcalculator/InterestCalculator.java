package com.refactor.interestcalculator;
import java.text.DecimalFormat;
public class InterestCalculator {
	private static DecimalFormat df = new DecimalFormat("0.00");
	private double calc(double amount,double rate,int compounded) {
		return amount*Math.pow(1+((rate/compounded)/100),compounded);
		
	}
	public void calculateInterest(double amount, int years, int IR, int comp) {
		for(int i=1;i<=years;i++) {
			//calculate amount at end of year
			double end = calc(amount,IR,comp);
			System.out.println("Year "+i+":");
			System.out.println("Began with £"+df.format(amount));
			//earnings is the end value minus the initial amount
			System.out.println("Earned £"+df.format(end-amount));
			System.out.println("Ended with £"+df.format(end));
			//at the end of the year the closing value is taken forward as the new starting value
			amount=end;
		}
	}
}
