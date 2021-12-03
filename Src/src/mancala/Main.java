package mancala;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Set up the GUI
 **/
public class Main {

    /**
     * This method is run when the program starts
     *
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {
            createAndShowGUI();
        });
    }

    /**
     * Create and display the GUI
     */
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Mancala");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new mancala.MancalaGame());

        frame.pack();
        frame.setVisible(true);
    }
}