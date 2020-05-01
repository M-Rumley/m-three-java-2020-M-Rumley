package com.refactor.interestcalculator;

import java.util.Scanner;

public class InterestCalculatorMain {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		double amount;
		int years,IR,comp;
		InterestCalculator i = new InterestCalculator();
		System.out.print("How much do you want to invest? ");
		amount = Integer.parseInt(inputReader.nextLine());
		System.out.print("How many years are you investing for? ");
		years = Integer.parseInt(inputReader.nextLine());
		System.out.print("What is the annual interest rate % growth? ");
		IR = Integer.parseInt(inputReader.nextLine());
		System.out.print("How often does the interest compund in a year? ");
		comp = Integer.parseInt(inputReader.nextLine());
		System.out.println();
		i.calculateInterest(amount, years, IR, comp);
		inputReader.close();

	}

}
