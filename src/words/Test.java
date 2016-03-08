/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Words
 * File: Test.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package words;

public class Test {

  public static void main(String[] args) {
    Words test = new Words("prueba.txt");
    test.count();
    GUI window = new GUI(test.toString());
    window.window(window);
  }
}
