/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HexToInt
 * File: Test.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package hexToInt;

public class Test {

  public static void main(String[] args) {
    HexToInt test = new HexToInt();
    GUI window;
    try {
      window = new GUI(test.run(),test.getHex());
      window.window(window);
    } catch (NumberFormatException e) {
      System.err.println("No correct Hex number" + e);
    }
  }

}
