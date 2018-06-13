package com.ioc;

public class Airtel implements Sim {
	
	
	@Override
	public void calling() {
		System.out.println("calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using airtel sim");
		
	}

}
