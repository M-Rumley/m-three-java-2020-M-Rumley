package com.refactor.luckysevens;

import java.util.Random;

public class LuckySevens {
	public void play(int cash) {
		Random r = new Random();
		int maxcash=cash;
		int maxcount=0;
		int count=0;
		int d1,d2;
		//while the player still has money
		while(cash>0) {
			//increase turn count
			count++;
			//get a new random dice roll (between 1 and 6)
			d1 = r.nextInt(6)+1;
			d2 = r.nextInt(6)+1;
			//if the player wins
			if(d1+d2==7) {
				cash+=4;
			}
			//or they loose
			else {
				cash--;
			}
			//if this is a new maximum then it is recorded
			if(cash>maxcash) {
				maxcash=cash;
				maxcount=count;
			}
		}
		//results are printed
		System.out.println("You go broke after "+count+" rolls.");
		System.out.println("You should have quit after "+maxcount+" rolls when you had £"+maxcash+".");
	}

}
