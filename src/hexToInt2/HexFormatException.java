/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HexToInt2
 * File: HexFormatException.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package hexToInt2;

public class HexFormatException extends Exception {

  private static final long serialVersionUID = 1L;

  public HexFormatException ( String msg ) {
    super ( msg ) ;
  }
  
  public HexFormatException ( Exception e ) {
    super ( "Hex format exception: " + e ) ;
    }
}
