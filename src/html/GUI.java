/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HtmlConverter
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package html;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame{
  
  private static final long serialVersionUID = 2L;
  
  public GUI(String file){
    setLayout (new GridLayout(2, 2, 5, 5));
    add(new JLabel ("Java file:"));
    add(new JTextField (8));
    add(new JButton ("Convert"));
    add(new JLabel("Your file is: "+ file));
  }
  
  public void window (GUI window){
    final int WIDTH = 300;
    final int HIGH = 200;
    GUI frame = window;
    frame.setTitle("The java2html conveter");
    frame.setSize(WIDTH, HIGH);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  }
}
