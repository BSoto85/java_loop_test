package org.example;

public class FilterNumbers {
     //use do for loop for this exercise
    public static String filterNumbers(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
