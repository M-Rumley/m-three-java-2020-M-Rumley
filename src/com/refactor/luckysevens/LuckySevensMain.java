package com.refactor.luckysevens;

import java.util.Scanner;

public class LuckySevensMain {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		LuckySevens l = new LuckySevens();
		System.out.print("How many pounds do you have? ");
		l.play(Integer.parseInt(inputReader.nextLine()));
		inputReader.close();
	}

}
