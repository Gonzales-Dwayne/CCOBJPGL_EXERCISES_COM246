package com.example;

import java.io.File;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomeController implements Initializable {

    ObservableList<User> mylist = FXCollections.observableArrayList();
    @FXML
    Label usernamelabel;


     @FXML
    private TableColumn<String,User> acccolumn;

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private Button createbutton;

    @FXML
    private Button deletebutton;

    @FXML
    private TableView<User> mytable;

    @FXML
    private TableColumn<String,User> passcolumn;

    @FXML
    private PasswordField passtextfield;

    @FXML
    private TableColumn<String,User> statscolumn;

    @FXML
    private Button updatebutton;

    @FXML
    private TableColumn<String,User> usercolumn;

    @FXML
    private TextField usertextfield;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

       initializeCol();
        loadData();

        // Add items to the choice box
        choicebox.getItems().addAll("Active", "Inactive");

        // Listener to update text fields when a row is selected
        mytable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            
            if (newSelection != null) {
                usertextfield.setText(newSelection.getUsername());
                passtextfield.setText(newSelection.getPassword());
                choicebox.setValue(newSelection.getAccountstatus());
            }
        });
        // TODO Auto-generated method stub
        String username = LoginController.user.getUsername();
        usernamelabel.setText(username);
    }
        private void initializeCol() {
            usercolumn.setCellValueFactory(new PropertyValueFactory<>("username"));
            passcolumn.setCellValueFactory(new PropertyValueFactory<>("password"));
            acccolumn.setCellValueFactory(new PropertyValueFactory<>("accountcreated"));
            statscolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        }

        private void loadData(){

        mylist.clear();

        try {
            // Create object from File class
            File myFile = new File("account.txt");

            // .exists() method checks if a file exists in the pathname
            if (myFile.exists()) {

                Scanner filescanner = new Scanner(myFile);

                while (filescanner.hasNextLine()) {

                    String data = filescanner.nextLine();
        
                    String username = data.split(",")[0];
                    String password = data.split(",")[1];
                    String dcreated = data.split(",")[2];
                    String status = data.split(",")[3];

                    mylist.add(new User(username, password, dcreated, status));
                } 
                mytable.setItems(mylist);

                filescanner.close();
            }
            else {
                System.out.println(myFile.getName() + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
        } 
    }
}
