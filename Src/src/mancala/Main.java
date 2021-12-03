package mancala;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Set up the UI
 **/
public class Main {

    /**
     *run when the program starts
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            createAndShowGUI();
        });
    }

    /**
     * display the UI
     */
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Mancala");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new mancala.MancalaGame());

        frame.pack();
        frame.setVisible(true);
    }
}
