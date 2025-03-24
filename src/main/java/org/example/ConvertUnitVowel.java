package org.example;

public class ConvertUnitVowel {
    //use do while loop for this exercise
    public static String convertUntilVowel(String str) {
        if (str.length() == 0) {
            return str;
        }
        String result = "";
        String vowels = "aeiou";
        int i = 0;
        do {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i)).toUpperCase();
            } else {
                result += String.valueOf(str.charAt(i));
            }
            i++;
        } while (i < str.length());
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
