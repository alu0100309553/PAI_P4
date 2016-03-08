/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HexToInt2
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package hexToInt2;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame{
  
  private static final long serialVersionUID = 2L;
  
  public GUI(int result, String hex){
    setLayout (new GridLayout(1, 1, 5, 5));
    add(new JLabel ("The hex number: " + hex + " is the integuer: "+ result));
  }
  
  public void window (GUI window){
    final int WIDTH = 400;
    final int HIGH = 100;
    GUI frame = window;
    frame.setTitle("Hex2Int converter");
    frame.setSize(WIDTH, HIGH);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  }
}
