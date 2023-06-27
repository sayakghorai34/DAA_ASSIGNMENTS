package com.example.menutry;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.Scene;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private DatePicker datepick;

    public void initialize(Scene scene) {
        int[] Arr=new int[]{1,2,3,4,5,6,7,8,9};
        MenuButton dynamicMenuButton = (MenuButton) scene.lookup("#dynamicMenuButton");
        for(int i=0;i< Arr.length;i++) {
            MenuItem menuI = new MenuItem("Button".concat(Integer.toString(i)));
            final int optionNumber = i;
            menuI.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    welcomeText.setText("Option" + optionNumber + "selected");
                }
            });
            dynamicMenuButton.getItems().add(menuI);
        }

        // Set the default value of the DatePicker
        datepick.setValue(LocalDate.now());
        datepick.setOnAction(event -> {
            LocalDate selectedDate = datepick.getValue();
            welcomeText.setText("Selected date: " + selectedDate.toString());
        });
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
