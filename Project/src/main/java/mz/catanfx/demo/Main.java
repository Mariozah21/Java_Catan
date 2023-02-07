package mz.catanfx.demo;

import Functional.Cards;
import Functional.Hand;
import Functional.HexAssignment;
import Functional.HexFilling;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Main extends Application {
    private static final String woodURL = "file:Wood_Hex.gif";

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        try {
            URL url = new URL("file:C:\\Users\\Admin\\Desktop\\java_catan(repo)\\Project\\src\\main\\java\\FXMLFiles\\Board.fxml").toURI().toURL();
            Parent root = FXMLLoader.load(url);
            Scene scene1 = new Scene(root, Color.RED);
            Image LogoIcon = new Image("file:catanlogo.png");
            stage.getIcons().add(LogoIcon);
            stage.setTitle("Catan");
            stage.setWidth(500);
            stage.setHeight(500);
            stage.setResizable(false);
            stage.setScene(scene1);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }




    }
}