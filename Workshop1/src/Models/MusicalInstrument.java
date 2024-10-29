
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

import Interfaces.*;
 
//adding the interfaces
public abstract class MusicalInstrument implements Comparable<MusicalInstrument> {
	
	 
	public abstract String MakeSound();
	public abstract double GetPrice();
	public abstract String GetPitchType();
	public abstract String toString();
	public abstract void setPrice(double price);
	public abstract String HowToPlay();
	public abstract String HowToFix();
	//@override comparision between two musical instrument objects
	 public int compareTo(MusicalInstrument o)
	 {
		 if(this.GetPrice()== o.GetPrice())
		 {
	 		return 0;	//this won't do anything
		 }
		 if(this.GetPrice() < o.GetPrice())
		 {
			 return 1;	//this will swap
		 }
		 else
		 {
			 return -1;		//wont do anything
		 }
	 }
	 


}
