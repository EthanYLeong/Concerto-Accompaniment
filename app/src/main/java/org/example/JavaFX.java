package org.example;

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFX extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            Sequence sequence = MidiSystem.getSequence(new File("Tchaikovsky Violin Concerto.mid"));
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception e) {

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        HBox horizontalBox = new HBox();
        Scene scene = new Scene(horizontalBox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
