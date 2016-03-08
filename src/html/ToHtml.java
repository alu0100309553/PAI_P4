/**
 * Author: Rubén Labrador Páez.
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 4
 * Class/Program: HtmlConverter
 * File: ToHtml.java
 * @author Rubén Labrador Páez
 * @version 1.0 08/03/2016
 **/

package html;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ToHtml {
  
  private BufferedReader reader;
  private BufferedWriter writer;
  boolean commentmode = false;
  boolean commentlinemode = false;
  
  final String keywords[] = { "abstract", "assert", "boolean",
      "break", "byte", "case", "catch", "char", "class", "const",
      "continue", "default", "do", "double", "else", "extends", "false",
      "final", "finally", "float", "for", "goto", "if", "implements",
      "import", "instanceof", "int", "interface", "long", "native",
      "new", "null", "package", "private", "protected", "public",
      "return", "short", "static", "strictfp", "super", "switch",
      "synchronized", "this", "throw", "throws", "transient", "true",
      "try", "void", "volatile", "while" };


  public ToHtml (String ficheroin){
    try{
      reader = new BufferedReader( new FileReader(ficheroin));
      File file = new File ("index.html");
      if (!file.exists()) {
        file.createNewFile();
      }
      writer = new BufferedWriter(new FileWriter( file.getAbsoluteFile()) );
    }
    catch (Exception e){
      System.err.println("File not foun or arguments wrong");
      System.err.println("try java ArrayRank inputtextfile"); 
    }
  }
  
  public boolean isakeyword(String token){
    return (Arrays.binarySearch(keywords, token) >= 0);
  }

  private String readLine(){
    String aux = "";
    try{
      aux = reader.readLine();
    }
    catch (Exception e){
      System.err.println("File not foun or arguments wrong");
      System.err.println("try java ArrayRank inputtextfile"); 
    }
    return aux;
  }

  private void writeString(String line){
    try{
      writer.write(line);
    }

    catch (IOException e){
      System.err.println("FileNotFoundException: " + e.getMessage());
    }
  }

  private String analize (String token){
    if (!getCommentMode ()){
      if (token.startsWith ("/*")){
        setCommentMode(true);
        return "<span style=\"color:GREEN\">" + token + " ";
      }
      else {
        if(!getCommentLineMode ()){
          if(token.contains("//")){
            setCommentLineMode (true);
            return "<span style=\"color:GREEN\">" + token + " ";
          } 
          else{
            if(isakeyword(token)){
              return "<strong style=\"color:BLACK\">"+token+"</strong> ";             
            }
            else{
              return token + " ";
            }
          }
        }
        else{
          if (token.contains("/n")){
            setCommentLineMode (false);
            return token +"<span> ";
          }
          else{
            return token + " ";
          }
        }
      }
    }
    else{
      if (token.endsWith("*/")){
        setCommentMode(false);
        return token +"</span> ";
      }
      else{
        return token  + " ";
      }
    }
  }
  
  public void run(){
    try{
      writeString("<span style=\"color:BLUE\">");
      while (reader.ready()) {
        
        String readdata = "";
        String writedata = "";
        readdata = readLine();
        String [] token = readdata.split("\\s");
        for (int i = 0; i<token.length; i++){
          writedata = analize(token[i]);
          writeString(writedata);
        }
        writeString("<br>");
      }
      writeString("</span>");
      reader.close();
      writer.close();
    }
    catch (Exception e){
      System.err.println("File not foun or arguments wrong");
      System.err.println("try java ArrayRank inputtextfile");
    }
  }
  
  private void setCommentMode (boolean value){
    commentmode = value;
  }
  
  private boolean getCommentMode (){
    return commentmode;
  }
  
  private void setCommentLineMode (boolean value){
    commentlinemode = value;
  }
  
  private boolean getCommentLineMode (){
    return commentlinemode;
  }


}
