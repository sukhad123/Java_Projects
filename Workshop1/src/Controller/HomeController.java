
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

package Controller;
import Models.*;
import Views.MusicalInstrumentView;
import Interfaces.*;
public class HomeController   {
	private MusicalInstrument instrument;
	private MusicalInstrumentView view;
	
	
	//parametrized constructor passing musical instrument
	public HomeController(MusicalInstrument instrument)
	{
		this.instrument = instrument;
		view = new MusicalInstrumentView(this.instrument);
	}
	
	public MusicalInstrument returnType()
	{
		return this.instrument;
	}
	
 

	//set the prices of all the instruments
	public void SetPrice(MusicalInstrument instrument, double price)
	{
		instrument.setPrice(price);
		
	}
	
	public  double  GetPrice()
	{
		return this.instrument.GetPrice();
	}
	public void printExpensiveItem()
	{
		this.view.printInstrumentDetail(this.instrument);
		
	}
	 
	public String GetInstrumentName()
	{
		return this.instrument.toString();
	}
	 
	
	public void add(MusicalInstrument instrument)
	{
		this.instrument = instrument;
	}
	
	public void printFamily(MusicalInstrument x)
	{
		this.view.familyPrinter(x);
	}
  
	 

}
