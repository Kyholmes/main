package seedu.address.logic.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text messageText;

    @FXML
    protected void handleButtonAction(ActionEvent event) {
        String username = this.usernameField.getText();
        String password = this.passwordField.getText();
        if (username.equals("") || password.equals("")) {
            messageText.setText("Please fill in both fields.");
        } else {
            if (LoginManager.authenticate(username, password)) {
                messageText.setText("Success! Please close this window.");
            } else {
                messageText.setText("Username and password do not match!");
            }
        }

        System.out.println(username + " " + password);
    }
}
