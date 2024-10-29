
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
public class Drum extends PercussionFamily{
    private String name = "Drum";
    private double price;
    
    //default constructor
    public Drum()
    {
    	this.price = 0;
    }
    public void SetPrice(double price)
    {
    	this.price = price;
    }
    public void setPrice(double price)
	{
		this.price = price;
	}
	public String MakeSound()
	{
		return "vibrating stretched membrane";
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
		return "Sonic pitch";
	}


	 
	public String HowToFix() {
		// TODO Auto-generated method stub
		return "replace the strings";
	}


	 
	public String HowToPlay() {
		 
		return "by hitting the membrane";
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
