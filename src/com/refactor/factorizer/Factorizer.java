package com.refactor.factorizer;

//Author:Michael Rumley

public class Factorizer {

	public void printFactors(int n) {
		int nfactors = 0;
		System.out.print("The factors of " + n + " are:");
		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				System.out.print(i + " ");
				nfactors++;
			}
		}
		System.out.println();
		System.out.println(n + " has " + nfactors + " factor(s)");
	}

	public boolean perf(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public boolean prime(int n) {
		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
