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

import java.util.ArrayList;

public class Pizza {
	private String size;
	private String crust;
	private ArrayList<String> selectedTopping;
	public Pizza()
	{
		//initialize my string arraylist
		selectedTopping = new ArrayList<>();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	
	public String[] getToopings() {
		return selectedTopping.toArray(new String[0]);
	}
	 
	public void setTopping(ArrayList<String> x)
	{
		 this.selectedTopping = x;
	}
	public boolean finalCheck()
	{
		boolean bool = false;
		try {
			if(this.getSize().equals(null) || this.getSize().equals("") || this.getCrust().equals(null) || this.getCrust().equals(""))
			{
				bool = false;
			}
			else
			{
				bool = true;
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Something is wrong");
		}
		return bool;
		
	}
	 
	

}
