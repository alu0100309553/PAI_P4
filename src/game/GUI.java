/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Game
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package game;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame{
  
  private static final long serialVersionUID = 1L;
  
  public GUI(int prize, String number){
    setLayout (new GridLayout(3, 2, 5, 5));
    add(new JLabel ("Your Number:"));
    add(new JTextField (8));
    add(new JButton ("Play"));
    add(new JLabel("The number is: " + number));
    add(new JLabel("You Win!!:"));
    add(new JLabel(""+prize));
  }
  
  public void window (GUI window){
    final int WIDTH = 300;
    final int HIGH = 200;
    GUI frame = window;
    frame.setTitle("Numbers Game");
    frame.setSize(WIDTH, HIGH);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  }
  

}
