/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HexToInt
 * File: HexToInt.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package hexToInt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexToInt {
  
  private String hex;
  
  private String getStringHex(){
    String aux = "";    
    Pattern p = Pattern.compile("^[0-9ABCDEFabcdef]+$");
    System.out.println("Introduce the HEX number:");
    Scanner textint = new Scanner(System.in);
    aux = textint.nextLine();
    Matcher m = p.matcher(aux);
    if (!m.matches()){
      textint.close();
      throw new NumberFormatException ();
    }
    textint.close();
    setHex(aux);
    return aux;
  }
  
  private int convert (String number){
    return Integer.decode("0x"+number);
  }
  
  public int run (){
    return convert (getStringHex());
  }
  
  private void setHex (String hex_){
    hex = hex_;
  }
  
  public String getHex () {
    return hex;
  }
}
