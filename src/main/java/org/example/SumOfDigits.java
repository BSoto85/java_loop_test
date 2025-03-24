package org.example;

public class SumOfDigits {
    //use while loop for this exercise
    public static int sumOfDigits(int num) {
       String digits = String.valueOf(num);
       int sum = 0;
       int i = 0;
       while (i < digits.length()) {
           sum += digits.charAt(i) - '0';
           i++;
       }
       return sum;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
