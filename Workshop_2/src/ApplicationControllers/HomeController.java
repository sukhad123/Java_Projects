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

package ApplicationControllers;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

//import models and views
import Application_Models.Customer;
import Application_Models.Order;
import Application_Models.Pizza;
 
import applicationView.PizzaView;


public class HomeController extends Application {
	private Customer customer;
	 
	
	private Pizza pizza;
	private PizzaView pizzaView;
	private Order order;
 
	
	//constructor 
	public HomeController()
	{
		customer = new Customer();

		pizza = new Pizza();
		pizzaView = new PizzaView(pizza,customer);
		//creating an order
				
		
	}
	@Override
	public void start(Stage primaryStage) {
	 
		 
		//confirm button
		pizzaView.getOkbtn().setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		        // Your action code here
		    	
		    	customer.SetDetails(pizzaView.getTxtFieldCustName(), pizzaView.getTextFieldCustNumber());
		    	pizza.setSize(pizzaView.getSize());
		    	pizza.setCrust(pizzaView.getCrust());
		    	pizza.setTopping(pizzaView.getTopping());
		    	if (customer.finalCheck() && pizza.finalCheck())
				 {
		    		
		    		 
					    order = new Order(pizza);
						//including the price of your toppings
						 order.IncludeTooping(pizza.getToopings());
						  order.setQty(pizzaView.getQty());
						 pizzaView.OrderSummary();
						 pizzaView.printTotal(order.getTotal());
						
				 }
		    	else
		    	{
		    		System.out.println("Enter all details first plese");
		    	}
		    }
		});
		
		//clear button
		pizzaView.getClear().setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event) {
				pizzaView.clearField();
				
				 
			}
		
			
		});
		pizzaView.getComboBox().setOnAction((event) -> {
			if (pizzaView.getComboBox().getValue() != null) {
		    	 int value = (int)pizzaView.getComboBox().getValue();
			    pizzaView.setQty(value);
			}
	    	});

			Scene scene = new Scene(pizzaView, 1100,600 );	 
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			 
			 
			primaryStage.setTitle("Seneca Pizza Store");
			primaryStage.show();
		 
	}
	
	//public
	
	public static void main(String[] args) {
		launch(args);
	}
}
