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
    private FlowPane imagesFlowPane;

    @FXML
    void playAgain(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeImageView();
    }

    /**
     * This will add a number to each ImageView and set the image to be the back of a Card
     */
    private void initializeImageView()
    {
        for (int i=0; i<imagesFlowPane.getChildren().size();i++)
        {
            //"cast" the Node to be of type ImageView
            ImageView imageView = (ImageView) imagesFlowPane.getChildren().get(i);
            imageView.setImage(new Image(Card.class.getResourceAsStream("images/back_of_card.png")));
            imageView.setUserData(i);

            //register a click listener
            imageView.setOnMouseClicked(event -> {
                System.out.println(imageView.getUserData());
            });
        }
    }
}
