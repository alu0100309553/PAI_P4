/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Game
 * File: Test.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package game;

public class Test {

  public static void main(String[] args) {
    Game game = new Game();
    GUI window = new GUI(game.run(),game.getRandom());
    window.window(window);
  }

}