

/**********************************************
Workshop 1
Course:		APD545 - Semester 5
Last Name:	Adhikari
First Name:	Sukhad
ID:			1565518219
Section: 	ZAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:		Sep 19, 2024
**********************************************/
package Models;

//Concrete class Harp implementation
public class Flute extends WoodwindFamily{
	private String name = "Flute";
	private double price;
	public Flute()
	{
		this.price = 0;
	}
	public String toString() 
	{
		return this.name;
	}
	public Flute(double price)
	{
		this.price = price;
	}
	public String MakeSound()
	{
		return "guiding a stream of air";
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	public double GetPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	 
	public String GetPitchType() {
		// TODO Auto-generated method stub
		return "Fundamental pitch is middle C";
	}

 
	public String HowToPlay() {
		 
		return "by blowing into the flute";
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public String HowToFix() {
		// TODO Auto-generated method stub
		return "N/A: it cannot be fixed";
	}

}
