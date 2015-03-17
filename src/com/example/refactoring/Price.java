package com.example.refactoring;

public abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
