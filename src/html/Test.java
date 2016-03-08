/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HtmlConverter
 * File: Test.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package html;

public class Test {

  public static void main(String[] args) {
    ToHtml test = new ToHtml("prueba.java");
    test.run();
    GUI window = new GUI("index.html");
    window.window(window);
  }

}
