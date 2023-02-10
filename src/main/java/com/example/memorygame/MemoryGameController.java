package com.example.memorygame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MemoryGameController implements Initializable {

    @FXML
    private Label correctGuessesLabel;

    @FXML
    private Label guessLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private FlowPane imagesFlowPane;

    @FXML
    void playAgain(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        imageView.setImage(deck.dealTopCard().getImage());
    }
}
