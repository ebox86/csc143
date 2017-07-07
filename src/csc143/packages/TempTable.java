package csc143.packages;

import csc143.packages.temp.Converter;
import csc143.packages.string.Double;

/**
 * A simple class that uses classes in named packages.
 */
public class TempTable {

   /**
    * A program that prints out a temperature conversion table
    * @param args The command-line arguments
    */
   public static void main(String[] args) {
   
      // print out headers
      System.out.println("Celsius  Fahrenheit");
      
      // print out values
      for(double c = 0.0; c <= 100.0; c += 10.0){
    	  System.out.println(Double.format1(c) + Double.format3(Converter.c2f(c)));
      }
   }
   
}