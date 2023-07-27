package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Controller {

    @FXML
    private void onStartButtonClick(ActionEvent event) throws IOException {
        Parent scene1Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        Scene scene1 = new Scene(scene1Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void onInfoButtonClick(ActionEvent event) throws IOException {
        Parent infoParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("info.fxml")));
        Scene infoScene = new Scene(infoParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(infoScene);
        window.show();
    }

    @FXML
    private void onExitButtonClick(ActionEvent event) {
        // Get the current stage and close it to exit the program
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
    }

    @FXML
    private void onBackButtonClick(ActionEvent event) throws IOException {
        // Load the main menu scene and set it on the current stage
        Parent mainMenuParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainMenu.fxml")));
        Scene mainMenuScene = new Scene(mainMenuParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(mainMenuScene);
        window.show();
    }
    @FXML
    private void onGoToScene1_1ButtonClick(ActionEvent event) throws IOException {
        // Load the scene1_1 scene and set it on the current stage
        Parent scene1_1Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_1.fxml")));
        Scene scene1_1 = new Scene(scene1_1Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_1);
        window.show();
    }
    @FXML
    private void onGoToScene1_2ButtonClick(ActionEvent event) throws IOException {
        Parent scene1_2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_2.fxml")));
        Scene scene1_2 = new Scene(scene1_2Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_2);
        window.show();
    }

    @FXML
    private void onGoToScene1_3ButtonClick(ActionEvent event) throws IOException {
        Parent scene1_3Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_3.fxml")));
        Scene scene1_3 = new Scene(scene1_3Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_3);
        window.show();
    }

    @FXML
    private void onGoToScene1_3ChoicesButtonClick(ActionEvent event) throws IOException {
        Parent scene1_3ChoicesParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_3_choices.fxml")));
        Scene scene1_3Choices = new Scene(scene1_3ChoicesParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_3Choices);
        window.show();
    }

    @FXML
    private void onGoToScene1_3BadButtonClick(ActionEvent event) throws IOException {
        Parent scene1_3BadParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_3_bad.fxml")));
        Scene scene1_3Bad= new Scene(scene1_3BadParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_3Bad);
        window.show();
    }

    @FXML
    private void onGoToScene1_3GoodButtonClick(ActionEvent event) throws IOException {
        Parent scene1_3GoodParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_3_good.fxml")));
        Scene scene1_3Good= new Scene(scene1_3GoodParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_3Good);
        window.show();
    }
    @FXML
    private void onGoToScene1_4ButtonClick(ActionEvent event) throws IOException {
        // Load the scene1_1 scene and set it on the current stage
        Parent scene1_4Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_4.fxml")));
        Scene scene1_4 = new Scene(scene1_4Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_4);
        window.show();
    }
    @FXML
    private void onGoToScene1_5ButtonClick(ActionEvent event) throws IOException {
        Parent scene1_5Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_5.fxml")));
        Scene scene1_5 = new Scene(scene1_5Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_5);
        window.show();
    }

    @FXML
    private void onGoToScene1_6ButtonClick(ActionEvent event) throws IOException {
        Parent scene1_6Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1_6.fxml")));
        Scene scene1_6 = new Scene(scene1_6Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene1_6);
        window.show();
    }
    @FXML
    private void onGoToScene2ButtonClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2.fxml")));
        Scene scene2 = new Scene(scene2Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2);
        window.show();
    }
    @FXML
    private void onGoToScene2_1ButtonClick(ActionEvent event) throws IOException {
        Parent scene2_1Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_1.fxml")));
        Scene scene2_1 = new Scene(scene2_1Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_1);
        window.show();
    }
    @FXML
    private void onGoToScene2_2ButtonClick(ActionEvent event) throws IOException {
        Parent scene2_2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_2.fxml")));
        Scene scene2_2 = new Scene(scene2_2Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_2);
        window.show();
    }
    @FXML
    private void onGoToScene2_3ButtonClick(ActionEvent event) throws IOException {
        Parent scene2_3Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_3.fxml")));
        Scene scene2_3 = new Scene(scene2_3Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_3);
        window.show();
    }
    @FXML
    private void onGoToScene2_3ChoiceButtonClick(ActionEvent event) throws IOException {
        Parent scene2_3ChoiceParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_3_choices.fxml")));
        Scene scene2_3Choice = new Scene(scene2_3ChoiceParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_3Choice);
        window.show();
    }
    @FXML
    private void onGoToScene2_3BadButtonClick(ActionEvent event) throws IOException {
        Parent scene2_3BadParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_3_bad.fxml")));
        Scene scene2_3Bad = new Scene(scene2_3BadParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_3Bad);
        window.show();
    }
    @FXML
    private void onGoToScene2_3GoodButtonClick(ActionEvent event) throws IOException {
        Parent scene2_3GoodParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_3_good.fxml")));
        Scene scene2_3Good = new Scene(scene2_3GoodParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_3Good);
        window.show();
    }
    @FXML
    private void onGoToScene2_4ButtonClick(ActionEvent event) throws IOException {
        Parent scene2_4Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_4.fxml")));
        Scene scene2_4 = new Scene(scene2_4Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_4);
        window.show();
    }

    @FXML
    private void onGoToScene2_5ButtonClick(ActionEvent event) throws IOException {
        Parent scene2_5Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene2_5.fxml")));
        Scene scene2_5 = new Scene(scene2_5Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene2_5);
        window.show();
    }
    @FXML
    private void onGoToScene3ButtonClick(ActionEvent event) throws IOException {
        Parent scene3Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3.fxml")));
        Scene scene3 = new Scene(scene3Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3);
        window.show();
    }
    @FXML
    private void onGoToScene3_1ButtonClick(ActionEvent event) throws IOException {
        Parent scene3_1Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_1.fxml")));
        Scene scene3_1 = new Scene(scene3_1Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_1);
        window.show();
    }
    @FXML
    private void onGoToScene3_2ButtonClick(ActionEvent event) throws IOException {
        Parent scene3_2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_2.fxml")));
        Scene scene3_2 = new Scene(scene3_2Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_2);
        window.show();
    }



    @FXML
    private void onGoToScene3_2ChoicesButtonClick(ActionEvent event) throws IOException {
        Parent scene3_2ChoicesParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_2_choices.fxml")));
        Scene scene3_2Choices = new Scene(scene3_2ChoicesParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_2Choices);
        window.show();
    }

    @FXML
    private void onGoToScene3_2BadButtonClick(ActionEvent event) throws IOException {
        Parent scene3_2BadParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_2_bad.fxml")));
        Scene scene3_2Bad= new Scene(scene3_2BadParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_2Bad);
        window.show();
    }

    @FXML
    private void onGoToScene3_2GoodButtonClick(ActionEvent event) throws IOException {
        Parent scene3_2GoodParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_2_good.fxml")));
        Scene scene3_2Good= new Scene(scene3_2GoodParent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_2Good);
        window.show();
    }

    @FXML
    private void onGoToScene3_3ButtonClick(ActionEvent event) throws IOException {
        Parent scene3_3Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_3.fxml")));
        Scene scene3_3 = new Scene(scene3_3Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_3);
        window.show();
    }

    @FXML
    private void onGoToScene3_4ButtonClick(ActionEvent event) throws IOException {
        Parent scene3_4Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene3_4.fxml")));
        Scene scene3_4 = new Scene(scene3_4Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene3_4);
        window.show();
    }
    @FXML
    private void onGoToScene4ButtonClick(ActionEvent event) throws IOException {
        Parent scene4Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene4.fxml")));
        Scene scene4 = new Scene(scene4Parent);

        // Get the current stage from the event
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the current stage
        window.setScene(scene4);
        window.show();
    }
}



