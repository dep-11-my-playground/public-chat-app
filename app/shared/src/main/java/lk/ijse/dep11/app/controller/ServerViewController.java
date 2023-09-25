package lk.ijse.dep11.app.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.app.User;

public class ServerViewController {
    public ListView<String> lvChat;
    public ListView<User> lvPeople;
    public Button btnSend;
    public TextField txtMessage;
    public AnchorPane root;

    public void btnSendOnAction(ActionEvent actionEvent) {

    }
}
