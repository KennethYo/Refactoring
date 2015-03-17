package com.example.refactoring;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0;
		result += daysRented * 3;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}
