/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 2
 * Class/Program: Age
 * File: Age.java
 * Description: Calculate the age between two dates indicated by command line.
 * @author Rubén Labrador Páez
 * @version 1.0 22/02/2016
 **/
package racional;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Age {
  /**
   * Main method of a program that calculates the age between tho dates.
   * @param args DD\\MM\\YYYY(birth date) DD\\MM\\YYYY(today)
   */
  public static void main(String[] args) {
    Date birth = null;
    Date today = null;
    Calendar calB = Calendar.getInstance();
    Calendar calT = Calendar.getInstance();
    int days = 0;
    int months = 0;
    int years = 0;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    try{
      birth = formatter.parse(args[0]);
      today = formatter.parse(args[1]);
    }
    catch (Exception e){
      System.err.println("Arguments wrong, try java Age DD\\MM\\YYYY(birth date) DD\\MM\\YYYY(today)");
    }
    calB.setTime(birth);
    calT.setTime(today);
    years = calT.get(Calendar.YEAR)-calB.get(Calendar.YEAR);
    months = calT.get(Calendar.MONTH)-calB.get(Calendar.MONTH);
    days = calT.get(Calendar.DAY_OF_MONTH)-calB.get(Calendar.DAY_OF_MONTH);
    if ( months<0 || (months==0 && days < 0)){
      years--;
    }
    System.out.println("Age: " + years);
  }

}