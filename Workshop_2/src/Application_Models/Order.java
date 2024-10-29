/**********************************************
Workshop 2
Course:APD545 - Semester
Last Name:Adhikari
First Name:Sukhad
ID:156518219
Section:ZAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:Oct 6, 2024
**********************************************/

package Application_Models;

import java.util.Arrays;

import Application_Models.*;

class SizePrice {
	public double small;
	public double medium;
	public double large;
	public double extraLarge;

	SizePrice() {
		small = 7;
		medium = 10;
		large = 13;
		extraLarge = 15;
	}

	public double SizePrice(String x) {

		x = x.toLowerCase();
		System.out.println(x);
		if (x.equals("small($7.00)")) {
			return this.small;
		}

		if (x.equals("medium($10.00)")) {
			return this.medium;
		}
		if (x.equals("large($13.00)")) {
			return this.large;
		}
		return extraLarge;

	}

}

class RegularTopping {

}

public class Order {
	private Pizza pizza;
	private int quantity;
	private double total;

	public Order(Pizza pizza) {

		SizePrice x = new SizePrice();
		this.total = x.SizePrice(pizza.getSize());

		// toppings

	}
	public void setQty(int x)
	{
		this.quantity = x;
	}

	// this function will add the price of the topping
	public void IncludeTooping(String[] x) {
		 
		try {
			int size = x.length;
			String vegTopping[] = { "Pineapple", "Extra Cheese", "Dried Shrimps", "Mushrooms", "Anchovies",
					"Sun Dreid Tomatoes", "Dacon", "Spinach", "Roasted Garlic", "Jalapeno" };
			String meatTopping[] = { "Ground Beef", "Shredded Chicken", "Grilled Chicken", "Pepperoni", "Ham",
					"Bacon" };
			for (int i = 0; i < size; i++) {
				if (Arrays.asList(vegTopping).contains(x[i])) {
					total += 1.10;
				}
				if (Arrays.asList(meatTopping).contains(x[i])) {
					total += 2.15;
				}

			}
		} catch (Exception e) {
			System.out.println("Topping implementation error");
		}

	}

	// total of your order

	public double getTotal() {
		return this.total *this.quantity;
	}

}
