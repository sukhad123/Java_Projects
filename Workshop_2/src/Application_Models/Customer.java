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

import javafx.scene.control.TextField;

//customer Model
public class Customer {
	public String name;
    private String custNumber;
    
 
	public String getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	public boolean finalCheck()
	{
		boolean bool = false;
		if(this.name.equals(null) || this.name.equals("") || this.getCustNumber().equals(null) || this.getCustNumber().equals(""))
		{
			bool = false;
		}
		else
		{
			bool  = true;
		}
		
		return bool;
	}
	
	public void SetDetails(TextField x, TextField y)
	{
		String a = x.getText().trim();
		this.name = a;
		
	    this.custNumber = y.getText().trim();
		
	}
	


}
