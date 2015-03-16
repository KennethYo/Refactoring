package com.example.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.addElement(rental);

	}

	public String getName() {
		return name;
	}

	public String statement() {
		Enumeration<Rental> rentals = this.rentals.elements();

		String result = "Rental Record for " + getName() + "\n";

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}

		result += "Amount owed is" + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned "
				+ String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();

		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();

		}
		return result;
	}

}
