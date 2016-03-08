/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Suma
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package suma;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame{
  
  private static final long serialVersionUID = 2L;
  
  public GUI(int result, int a, int b){
    setLayout (new GridLayout(3, 1, 5, 5));
    add(new JLabel ("A number is: " + a));
    add(new JLabel ("B number is: " + b));
    add(new JLabel ("A + B is: " + result));
  }
  
  public void window (GUI window){
    final int WIDTH = 300;
    final int HIGH = 200;
    GUI frame = window;
    frame.setTitle("The add Machine");
    frame.setSize(WIDTH, HIGH);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  }
  

}
