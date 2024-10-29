
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
package Main;
import Controller.HomeController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Models.*;
import workshop1.models.musicalInstrument.MusicalInstrument;

import java.util.Scanner;
public class Main {

	public static void start()
	{
		
		//declaring all the concrete classes
		Drum drum = new Drum();
		Flute flute= new Flute();
		Guitar guitar = new Guitar();
		Harp harp = new Harp();
		Xylophone xylophone = new Xylophone();
		
		
		
		List<MusicalInstrument> list = new ArrayList<>();
		list.add(drum);
		list.add(flute);
		list.add(guitar);
		list.add(harp);
		list.add(xylophone);
		
		HomeController[] homeController= new HomeController[5];
		
		MusicalInstrument StringFamily[] = {guitar, harp};
		MusicalInstrument PercussionFamily[] = {drum, xylophone};
		MusicalInstrument WoodwindFamily[] = {flute};
	   
	    
		//user Input
	 
		for(var i: list)
		{
			Scanner myObj = new Scanner(System.in);
			System.out.print("Enter the Price for "+ i.toString() + ": ");
			//update the price for all the new musical instruments;
			i.setPrice(myObj.nextDouble());
		  
			
		}
		newline();
		MusicalInstrument[] regularList = new MusicalInstrument[5];
		
		Collections.sort(list);
		
		list.toArray(regularList);
		for(int i = 0; i < 5;i ++)
		{
			homeController[i] = new HomeController(regularList[i]);
		}
		
		findExpensiveItem(homeController[0]);
		newline();
		
		//instruments in price descending order
		System.out.println("Instruments in price descending order:");
		System.out.print("[");
		 
		for(var i: homeController)
		{
			System.out.print(i.GetInstrumentName());
			if(i.GetInstrumentName() !=  homeController[4].GetInstrumentName())
			{
				System.out.print(",");
				
			}
			
		}
		System.out.print("]");
		newline();
		
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter an instrument Family: ");
			String myObj2 =  scanner.nextLine();
			 if (myObj2.equals("String"))
			 {   
		            familyPrinter(StringFamily);  
		        } else if (myObj2.equals("Percussion")) {
		            familyPrinter(PercussionFamily); 
		        } else if (myObj2.equals("Woodwind")) {
		            familyPrinter(WoodwindFamily); 
		        }
		        else
		        {
		        	System.out.println("Such Family Doesnot exists in our database");
		        }


			 
		}
	 
	//new line printer
	public static void newline()
	{
		System.out.println("\n");
	}
	public static void familyPrinter(MusicalInstrument [] instrument)
	{
		HomeController x = new HomeController(instrument[0]);
		for(var i: instrument)
		{
			x.printFamily(i);
		}
	}
	 
	//implementing comparable object to compare the object
	public static void findExpensiveItem(HomeController instrument)
	{
		instrument.printExpensiveItem();
	}
	

	 
	public static void main(String[] args) {
		start();
		//TODO Auto-generated method stub

	}

}
