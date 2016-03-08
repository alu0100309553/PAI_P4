/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: Words
 * File: Words.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public class Words {
  
  private BufferedReader reader;
  private Hashtable <String, Integer> wordtable = new Hashtable <String, Integer>();
  /**
   * Class constructor, open the file where the text is stored.
   * @param filename "The name of the file to read"
   */
  Words(String filename){
    try{
      reader = new BufferedReader( new FileReader(filename));
    }
    catch (Exception e){
      System.err.println("File not foun or arguments wrong");
      System.err.println("try java ArrayRank inputtextfile");
    }
  }
  /**
   * Public method that count the different words of the text.
   */
  public void count () {

    try {
      while (reader.ready()) {
        String data;
        data = reader.readLine();
        String [] token = data.split("[^áéíóú\\w]+");
        for (int k = 0; k < token.length; ++k){
          String temp = token[k].toLowerCase();
          if (wordtable.containsKey(temp)){
            int aux = (int) wordtable.get(temp);
            aux += 1;
            wordtable.put(temp, aux);
          }
          else {
            wordtable.put(temp, 1);          
          }
        }
      }
    } catch (IOException e) {
      System.err.println("File error");
    }
  }
 /**
  * Public method that returns a string with the information stored in the wordtable to print it.
  */
 public String toString(){
   String aux = "";
   Vector <String> temp = new Vector <String> (wordtable.keySet());
   Collections.sort(temp);
   for (int i = temp.size()-1; i >=0; i-- ){
     if (wordtable.get(temp.get(i))==1)
     aux += temp.get(i) + "\n";
   }
   return aux;
 }
}
