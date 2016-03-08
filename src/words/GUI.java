/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Words
 * File: GUI.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package words;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI extends JFrame{
  
  private static final long serialVersionUID = 2L;
  
  public GUI(String words){
    setLayout (new GridLayout(2, 1, 5, 5));
    add(new JLabel ("The words in the document are:"));
    add(new JScrollPane(new JTextArea (words)));
  }
  
  public void window (GUI window){
    final int WIDTH = 300;
    final int HIGH = 500;
    GUI frame = window;
    frame.setTitle("Word counter");
    frame.setSize(WIDTH, HIGH);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  }
}
