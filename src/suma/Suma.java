/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Suma
 * File: Suma.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package suma;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Suma {
  private int a, b = 0 ;
  
  private int getNumber(){
    int num = 0;
    Pattern p = Pattern.compile("[\\d]+");
    boolean b = false;
    String aux = "";
    System.out.println("Introduce the number:");
    while (!b){
      aux = getStringNumber();
      Matcher m = p.matcher(aux);
      b = m.matches();
      if (b){
        num = Integer.parseInt(aux);
      } 
      else{
        System.out.println("The number is not correct, please try again:");
      }
    } 
    return num;
  }
  
  private String getStringNumber () {
    String aux = "";
    Scanner textint = new Scanner(System.in);
    aux = textint.nextLine();
   // textint.close();
    return aux;    
  }
  
  public int run() {
    setA (getNumber());
    setB (getNumber());
    return getA () + getB ();
  }
  
  public void setA (int value) {
    a = value;
  }
  
  public void setB (int value) {
    b = value;
  }
  
  public int getA () {
    return a;
  }
  
  public int getB () {
    return b;
  }
}
