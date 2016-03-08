/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Suma
 * File: Test.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package suma;

public class Test {

  public static void main(String[] args) {
    Suma test = new Suma();
    GUI window = new GUI(test.run(), test.getA(), test.getB());
    window.window(window);
  }
}
