package org.example;

public class CountDigits {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }


    //use do while loop for this exercise
    public static int countDigits(int num) {
        int count = 0;
        String digits = String.valueOf(num);
        return digits.length();
    }

}
