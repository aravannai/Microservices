package com.sathish.microservices.limitsservice.bean;

public class LimitsConfiguration {

	private int maximum;
	private int minimum;
	
	public LimitsConfiguration() {}
	
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
}
