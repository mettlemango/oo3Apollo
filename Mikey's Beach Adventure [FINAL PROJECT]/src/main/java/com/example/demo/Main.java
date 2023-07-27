package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

public class Main extends Application {
    private MediaPlayer mediaPlayer;
    private double backgroundMusicVolume = 0.25; // Adjust the volume here (0.0 to 1.0)

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        AnchorPane anchorPane = fxmlLoader.load();

        Scene mainMenuScene = new Scene(anchorPane);

        // Load the background music file
        String bgMusicFile = "background_music.mp3"; // Assuming the file is directly under src/main/resources
        Media bgMusicMedia = new Media(Paths.get("src/main/resources/" + bgMusicFile).toUri().toString());
        mediaPlayer = new MediaPlayer(bgMusicMedia);
        mediaPlayer.setVolume(backgroundMusicVolume); // Set the specified volume
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Set to repeat indefinitely
        mediaPlayer.play();

        stage.setTitle("Mikey's Beach Adventure!");

        // Set the AnchorPane dimensions to match the application's window (console) size
        stage.widthProperty().addListener((obs, oldVal, newVal) -> anchorPane.setPrefWidth(newVal.doubleValue()));
        stage.heightProperty().addListener((obs, oldVal, newVal) -> anchorPane.setPrefHeight(newVal.doubleValue()));

        stage.setScene(mainMenuScene);
        stage.show();
    }

    @Override
    public void stop() {
        // Stop the background music when the application is closed
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
