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
package applicationView;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.Arrays;

import Application_Models.Customer;
import Application_Models.Pizza;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
 
import javafx.scene.layout.Pane;
 
public class PizzaView extends Pane {
	
	 private static final Object selectedTopping = null;
	 private Pizza pizza;
	 
	 
	 //confirm and clear button
	 private Button okbtn;
	 private Button clear;
	 
	 
	 private Customer customer;
	 private TextField txtFieldCustName;
	 private TextField textFieldCustNumber;
	 private String size;
	 private String crustinput;
	 private ArrayList<String> toopingInput;
	 private int qty;
	
	 
	 public ToggleGroup tg1;
	 public ToggleGroup tg2;
	 public ComboBox comboBox;
	 
	 //constructor
	 public PizzaView(Pizza pizza, Customer customer)
	 {
		 this.pizza = pizza;
		 
		 this.customer = customer;
			
			
			//customer heading
			Label heading = new Label("Seneca Pizza Store");
			heading.relocate(430, 20);
	     
	        
	        // Optional: Set styling for the label
	        heading.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
	        
	         
	        Label custD = new Label("Customer Details");
	        custD.relocate(40,45);
	        custD.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
			Label name  = new Label("Enter your Name");
			name.relocate(40, 80);
			
			txtFieldCustName = new TextField();
			txtFieldCustName.setPrefWidth(200);  // Set preferred width
			txtFieldCustName.setPrefHeight(25);
			txtFieldCustName.relocate(190,  75);
			
			Label number = new Label("Enter your Phone Number");
			number.relocate(40, 115);
			textFieldCustNumber = new TextField();
			textFieldCustNumber.setPrefWidth(200);  // Set preferred width
			textFieldCustNumber.setPrefHeight(30);
			textFieldCustNumber.relocate(190,110);
		    getChildren().addAll(name, heading, custD,txtFieldCustName, number, textFieldCustNumber);
		  
		  
		  
		 okbtn = new Button("Confirm");
		 okbtn.prefWidth(200);  // Set preferred width
		 okbtn.prefHeight(25);
		 okbtn.relocate(600, 540);
		  
	        
        clear = new Button("Clear");
        clear.prefWidth(200);  // Set preferred width
        clear.prefHeight(25);
        clear.relocate(960, 540);
		 Label pizzaD = new Label("Create Your Pizza");
		 pizzaD.relocate(110, 175);
		 pizzaD.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
		 
		 Label title = new Label("Select the Size of your Pizza");
		 title.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
		 title.relocate(40, 220);
		 
		 
		 
		 //size
		 RadioButton r1 = new RadioButton("Small($7.00)");
		 RadioButton r2 = new RadioButton("Medium($10.00)");
		 RadioButton r3 = new RadioButton("Large($13.00)");
		 RadioButton r4 = new RadioButton("Extra Large($15.00)");
		 r1.relocate(40, 250);
		 r2.relocate(40, 270);
		 r3.relocate(40,  290);
		 r4.relocate(40,  310);
		  tg1 = new ToggleGroup();
		 //add all the radios in our tooglegroup
		 r1.setToggleGroup(tg1); 
	     r2.setToggleGroup(tg1); 
	     r3.setToggleGroup(tg1); 
	     r4.setToggleGroup(tg1);
	     tg1.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
	        { 
	            public void changed(ObservableValue<? extends Toggle> ob,  
	                                                    Toggle o, Toggle n) 
	            { 
	  
	                RadioButton rb = (RadioButton)tg1.getSelectedToggle(); 
	  
	                if (rb != null) { 
	                    String s = rb.getText(); 
	  
	                    // change the label 
	                    
	                    String pizzaSize = s.trim();
	                     size = pizzaSize;
	                    //pizza.setSize(pizzaSize);
	                } 
	            } 
	        });
	    
	     //set your size
	    
	     
	     //crust pizza frontend implementation
	     Label crust = new Label("Select Crust Type");
	     crust.relocate(40, 370);
	     crust.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
		 
		 //radioButton for crust
	     
	     RadioButton r11 = new RadioButton("Normal");
		 RadioButton r22 = new RadioButton("Thin");
		 RadioButton r33 = new RadioButton("Deep Dish");
		 
		 r11.relocate(40, 400);
		 r22.relocate(40, 420);
		 r33.relocate(40,  440);
		 
		  tg2 = new ToggleGroup();
		 //add all the radios in our tooglegroup
		 r11.setToggleGroup(tg2); 
	     r22.setToggleGroup(tg2); 
	     r33.setToggleGroup(tg2); 
	      
	     tg2.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
	        { 
	            public void changed(ObservableValue<? extends Toggle> ob,  
	                                                    Toggle o, Toggle n) 
	            { 
	  
	                RadioButton rb = (RadioButton)tg2.getSelectedToggle(); 
	  
	                if (rb != null) { 
	                    String s = rb.getText(); 
	  
	                
	                     crustinput = s.trim();
	                    ///pizza.setCrust(s.trim());
	                } 
	            } 
	        });
	     
	     
	     //toppings
	    String Toopings []= { "Pineapple", "Extra Cheese", "Dried Shrimps", "Mushrooms", "Anchovies", "Sun Dreid Tomatoes", "Dacon", "Spinach", "Roasted Garlic", "Jalapeno", "Ground Beef", "Shredded Chicken", "Grilled Chicken", "Pepperoni", "Ham", "Bacon"};
		 
	     
	     ObservableList<String> items = FXCollections.observableArrayList(Arrays.asList(Toopings));
	    ListView<String> listView = new ListView<>(items);
	    
	    
	    
	    
	     listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	     
	     toopingInput = new ArrayList<>();
         ObservableList<Object> selectedItems = FXCollections.observableArrayList(selectedTopping);
        
	     ListView<Object> listView1= new ListView<>(selectedItems);
	     //EVENT LISTENER TO DISPLAY MULTIPLE SELECTED VALUES
	     //array to store the selected topping
	    selectedItems.remove(0);
	     listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
	    	    @Override
	    	    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	    	        // Your action here
	    	    	
	    	    	
	    	    	//pizza.addTopping(newValue);
	    	    	toopingInput.add(newValue);
	    	    	selectedItems.add(newValue);
	    	    }
	    	});
	     //SETUP THE TOPPINGS
	     
	     
	     Label lado = new Label("Selected Toppings");
	     lado.relocate(40, 480);
	     lado.setStyle("-fx-font-size: 10px; -fx-font-weight: bold;");
	     listView1.setPrefSize(200, 90);
	     listView1.relocate(40, 500);
	     Label topping = new Label("  Toppings");
	     topping.relocate(350,170);
	     topping.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
	  
	     
	     listView.relocate(300, 200);
	     listView.setPrefSize(200, 380);
	     
	     Label quantity = new Label("Quantity");
	     quantity.relocate(510,170);
	     quantity.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
	      comboBox = new ComboBox();
	     for ( int i = 0; i < 10; i ++)
	     {
	    	 comboBox.getItems().add(i);
	     }
	     
	     comboBox.setPrefWidth(30);
	     comboBox.setPrefHeight(30);
	     comboBox.relocate(520,200);
	     
 
	     //order table
	     Pane hbox = new Pane();

	        // Set the style using setStyle
	        hbox.setStyle("-fx-background-color: darkgray; " + // Background color
	                       "-fx-padding: 15; " +             // Padding
	                       "-fx-spacing: 10;");     
	        // Set the preferred size of the HBox
	        hbox.setPrefWidth(400);
	        hbox.setPrefHeight(450);

	        // Set the position of the HBox within the Pane
	        hbox.setLayoutX(600); // X position
	        hbox.setLayoutY(80); // Y position
	     
	      
	        
	      
         
	     getChildren().addAll(pizzaD, title, r1,r2,r3,r4, crust, r11,r22,r33, topping, listView, listView1,lado,quantity, hbox, okbtn, clear, comboBox	    		  );
	 }
	 
	 
	//order summary
	 public void OrderSummary()
	 {
		 
		 Label custDetails = new Label("Customer Details");
		 custDetails.relocate(700, 120);
		 custDetails.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
	      
		 
		 Label orderName = new Label("Customer Name: " +customer.name);
		 orderName.relocate(650, 180);
		 orderName.setStyle("-fx-font-size: 15px; ");
		 
		 Label orderNumber = new Label("Customer Number: " +customer.getCustNumber());
		 orderNumber.relocate(650, 200);
		 orderNumber.setStyle("-fx-font-size: 15px; ");
		 
		 //pizza info
		 Label pizza1 =new Label("Your Pizza Details");
		 pizza1.relocate(650, 230);
		 pizza1.setStyle("-fx-font-size: 15px; ");
		 
		 Label pizza2 =new Label("Size: "+ pizza.getSize());
		 pizza2.relocate(650, 250);
		 pizza2.setStyle("-fx-font-size: 15px; ");
		 
		 Label pizza3 =new Label("Crust: "+ pizza.getCrust());
		 pizza3.relocate(650, 270);
		 pizza3.setStyle("-fx-font-size: 15px; ");
		 
		 Label pizzat =new Label("Topping");
		 pizzat.relocate(650, 300);
		 pizzat.setStyle("-fx-font-size: 15px; ");
		 ObservableList<String> toppingitems = FXCollections.observableArrayList(Arrays.asList(pizza.getToopings()));
		 ListView<String> pizza4 = new ListView<>(toppingitems);
		 pizza4.setPrefSize(200, 100);
		 pizza4.relocate(650, 320);
		 
		 Label pizza5 =new Label("Quantity:"+ getQty());
		 
		 pizza5.relocate(650, 430);
		 pizza5.setStyle("-fx-font-size: 15px; ");

		 
		 
		 getChildren().addAll(custDetails, orderName,orderNumber, pizza1, pizza2, pizza3, pizza4,pizzat,pizza5);
		 
	 }
	 
	 public void printTotal(double x)
	 {
         Label pizza6 =new Label("Total:"+ String.format("%.2f", x));
		 
         pizza6.relocate(650, 450);
         pizza6.setStyle("-fx-font-size: 15px; ");
         Label pizza7 =new Label("Total with Taxes:"+ String.format("%.2f", (x*1.13)));
		 
         pizza7.relocate(650, 470);
         pizza7.setStyle("-fx-font-size: 15px; ");
		 getChildren().addAll(pizza6,pizza7);
		 
	 }
	 
	 public void clearField()
	 {
		 txtFieldCustName.clear();
	     textFieldCustNumber.clear();
	     tg1.selectToggle(null);
	     tg2.selectToggle(null);
	     comboBox.getSelectionModel().clearSelection();
	     toopingInput.clear();
	     
	     
	     
		 
	 }

	public static Object getSelectedtopping() {
		return selectedTopping;
	}

	

	public Pizza getPizza() {
		return pizza;
	}


	public Button getOkbtn() {
		return okbtn;
	}


	public Button getClear() {
		return clear;
	}


	public Customer getCustomer() {
		return customer;
	}


	public TextField getTxtFieldCustName() {
		return txtFieldCustName;
	}


	public TextField getTextFieldCustNumber() {
		return textFieldCustNumber;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getSize() {
		return size;
	}


	public String getCrust() {
		return crustinput;
	}


	public ArrayList<String> getTopping() {
		return toopingInput;
	}


	public String getCrustinput() {
		return crustinput;
	}


	public ArrayList<String> getToopingInput() {
		return toopingInput;
	}


	public ToggleGroup getTg1() {
		return tg1;
	}


	public ToggleGroup getTg2() {
		return tg2;
	}


	public ComboBox getComboBox() {
		return comboBox;
	}

 
	
	 
	 
	 
	 

}
