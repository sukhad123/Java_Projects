module WOrkshopppppppppppppppp2 {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	exports ApplicationControllers to javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
