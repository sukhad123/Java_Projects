package ApplicationControllers;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import models and views
import Application_Models.Customer;
import Application_Models.Pizza;
import applicationView.CustomerView;
import applicationView.PizzaView;


public class HomeController extends Application {
	private Customer customer;
	private CustomerView custView;
	
	private Pizza pizza;
	private PizzaView pizzaView;
 
	
	//constructor 
	public HomeController()
	{
		customer = new Customer();
		 
		custView = new CustomerView(customer);
		
		pizza = new Pizza();
		pizzaView = new PizzaView(pizza);
	}
	@Override
	public void start(Stage primaryStage) {
		    custView.getChildren().add(pizzaView);
	  
			Scene scene = new Scene(custView, 1100,600 );	 
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
