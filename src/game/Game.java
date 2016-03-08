/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Game
 * File: Game.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package game;

import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Game {
  private String random;
  
  private String getNumber(){
    Random rm = new Random ();
    return StringUtils.leftPad(String.valueOf(rm.nextInt(999)), 3, "0");
  }
  
  private String getAnswer(){
    String aux = "";
    System.out.println("Introduce the number:");
    Scanner textint = new Scanner(System.in);
    aux = textint.nextLine();
    textint.close();
    return StringUtils.leftPad(String.valueOf(aux), 3, "0");
  }
  
  private int prize (String rm, String nm){
    int aux = 0;
    if (rm.equals(nm)){
      aux = 10000;
    }
    else{
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
          if (rm.charAt(i)==nm.charAt(j)){
            aux += 1000;
            nm.replaceFirst(""+rm.charAt(i), "X");
            break;
          }
        }
      }
    }
    return aux;
  }
  
  public int run (){
    setRandom(getNumber());
    String b = getAnswer();
    return prize(random,b);
  }
  
  private void setRandom(String value){
    random = value;
  }
  
  public String getRandom(){
    return random;
  }
}
