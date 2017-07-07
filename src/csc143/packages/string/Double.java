package csc143.packages.string;

import java.text.DecimalFormat;
import java.util.Collections;

/**
 * A class to handle conversion of double values to String representations.
 */
public class Double {

   /**
    * Creates a String representation of the given double value.
    * The string representation will have one place following the
    * decimal point and be right justified within an output string
    * of six characters.
    * @param value  The double value to be formatted
    * @return       The formatted string
    */
   public static String format1(double value) {
	  return format(value, 1, 6);
      
   }
   
   /**
    * Creates a String representation of the given double value.
    * The string representation will have three places following the
    * decimal point and be right justified within an output string
    * of twelve characters.
    * @param value  The double value to be formatted
    * @return       The formatted string
    */
   public static String format3(double value) {
	  return format(value, 3, 12);
      
   }
   
   /**
    * Creates a String representation of the given double value.
    * @param value  The double value to be formatted
    * @param places The number of places after the decimal point
    * @param width  The length of the output String. The value will be
    *               right justified within the output String.
    * @return       The formatted string
    */
   public static String format(double value, int places, int width) {
	   StringBuilder sb = new StringBuilder();
	   String zeros = new String(new char[places]).replace("\0", "0");
	   DecimalFormat df = new DecimalFormat("0." + zeros);
	   String strNum = String.valueOf(df.format(value));
	   int strLen = width - strNum.length();
	   for(int i = 1; i <= strLen; i++) sb.append(" ");
		  sb.append(strNum);
	   return sb.toString();
   }
   
}