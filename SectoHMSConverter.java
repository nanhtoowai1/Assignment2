package com.phoo.test;

public class SectoHMSConverter {
	public void convert(int seconds) {
		
		int hours=0;
		int mins=0;
		
		while(seconds>=60) {
			mins++;
			seconds-=60;
		}
		while(mins>=60) {
			hours++;
			mins-=60;
		}
				
		System.out.println(hours+"h: "+mins+"m: "+seconds+"s");
	}
}
