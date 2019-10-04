package com.SpringBoot.IOC;

public class Vodafone implements Sim {

	public void calling() {
		System.out.println("Calling using vodafone Sim");
		
	}

	public void data() {
		
		System.out.println("Browsing using vodafone Sim");
	}

}
