package com.simplilearn.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static double division(int num1, int num2) {
    	if(num2 == 0.0) return 0;
    	return num1/num2;
    }
}