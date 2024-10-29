
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
public class Xylophone extends PercussionFamily{
	private String name = "Xylophone";
	private double price;
	
	public Xylophone()
	{
		this.price = 0;
	}
	public Xylophone(double price)
	{
		this.price = price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String MakeSound()
	{
		return "through resonators";
	}
	public String toString() 
	{
		return this.name;
	}
	 
	public double GetPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	 
	public String GetPitchType() {
		// TODO Auto-generated method stub
		return "Each bar produces different pitch";
	}


	 
	public String HowToFix() {
		// TODO Auto-generated method stub
		return "replace bars";
	}


	 
	public String HowToPlay() {
		 
		return "with two mallets";
	}


	 

}
