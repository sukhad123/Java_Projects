
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

//Concrete class Guitar implementation
public class Guitar extends StringFamily{
	private String name = "Guitar";
	private double price;
	
	public Guitar(double price)
	{
		this.price = price;
	}
	public Guitar() {
		this.price = 0;
		// TODO Auto-generated constructor stub
	}
	public String MakeSound()
	{
		return "vibrating string";
	}
	public String toString() 
	{
		return this.name;
	}
	 
	public double GetPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	public String GetPitchType() {
		// TODO Auto-generated method stub
		return "Low to high pitch";
	}


	 
	public String HowToFix() {
		// TODO Auto-generated method stub
		return "replace the strings";
	}


	 
	public String HowToPlay() {
		 
		return "by strumming the strings ";
	}


	public String getName() {
		// TODO Auto-generated method stub
		return "Guitar";
	}

}
