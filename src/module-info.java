module workshop_javafx_jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    
    // Se o seu JDBC for usado mais tarde, você precisará disso:
    // requires java.sql; 

    opens application to javafx.graphics, javafx.fxml;
    
    // ESTA É A LINHA QUE FALTA:
    opens gui to javafx.fxml;
}