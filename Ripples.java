/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ripples;

import javax.swing.JFrame;

/**
 *
 * @author jbaarsch
 */
public class Ripples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pond");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PondPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
