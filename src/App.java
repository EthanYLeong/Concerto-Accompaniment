import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class App {

    public static void main(String[] args) throws Exception {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            Sequence sequence = MidiSystem.getSequence(new File("Tchaikovsky Violin Concerto.mid"));
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (Exception e) {

        }
    }
}
