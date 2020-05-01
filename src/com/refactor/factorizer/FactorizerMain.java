package com.refactor.factorizer;

import java.util.Scanner;

public class FactorizerMain {

	public static void main(String[] args) {
		// number requested
		int n;
		Factorizer f = new Factorizer();
		Scanner inputReader = new Scanner(System.in);
		System.out.print("What number would you like to factor?");
		n = Integer.parseInt(inputReader.nextLine());
		f.printFactors(n);
		if (f.perf(n)) {
			System.out.println("Number is perfect");
		}
		if (f.prime(n)) {
			System.out.println("Number is prime");
		}
		inputReader.close();

	}

}
