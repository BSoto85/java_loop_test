package org.example;

public class ReverseString {
    //use do while loop for this exercise
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        int i = str.length() - 1;
        String result = "";
        do {
            result += str.charAt(i);
            i--;
        } while (i >= 0);
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
