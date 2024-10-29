
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
package Views;
import Models.MusicalInstrument;

public class MusicalInstrumentView {

	 private MusicalInstrument instrumentView;
	 public MusicalInstrumentView(MusicalInstrument instrument)
	 {
		 this.instrumentView = instrument;
	 }
	 
	 public void printInstrumentDetail(MusicalInstrument view)
	 {
		 System.out.println("The most expensive instrument is: " + view.toString());
		 System.out.println(view.toString() + "'s cost is " + "$" + view.GetPrice());
		 System.out.println(view.toString() +"is played by " + view.HowToPlay());
		 System.out.println(view.toString() + "fixing: " + view.HowToFix());
		 System.out.println(view.toString() + " pitch type: " + view.GetPitchType());
		 
	 }
	 
	 //print in descending order
	 public void printDescending(MusicalInstrument[] view)
	 {
		 System.out.print("[");
		 for(var i: view)
		 {
			System.out.print(i.toString() + ",");
		 }
	 }
	 
	 public void familyPrinter(MusicalInstrument view)
	 {
		 System.out.println(view.toString() + " makes " + view.MakeSound());
	 }
}
