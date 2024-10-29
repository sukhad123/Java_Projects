
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
public class Harp extends StringFamily{
	private String name = "Harp";
	private double price;
	
	public Harp()
	{
		this.price = 0;
	}
	public Harp(double price)
	{
		this.price = price;
	}
	
	public String MakeSound()
	{
		return "vibrating strings";
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
		return "Has seven levels of pitch";
	}


	 
	public String HowToFix() {
		// TODO Auto-generated method stub
		return "replace the strings";
	}


	 
	public String HowToPlay() {
		 
		return "with the thump and first three fingers";
	}


 
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
