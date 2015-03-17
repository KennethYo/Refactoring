package com.example.refactoring;

public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0;
		result += 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

}
