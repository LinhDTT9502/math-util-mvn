/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.linhdtt.mathutil.core;

//clone class java.util.Math,
//having function static
//(Math.sqrt() Math.sin() Math.random() and PI number
/**
 *
 * @author ACER
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    // n! = 1.2.3...n
    // des code below:
    // 0! = 1! = 1
    // dont have negative factorial number. if give -1!, -5!: exception
    // factorial increase fast, 20! is enough for long
    // long: having 18th number 0
    // 21! exception for long
    // only allowed n = 0..20
    // give n >20; exception
    public static long getFactorial(int n) {
        if ( n < 0 || n >20)
            throw new IllegalArgumentException("invalid n");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n ; i++) 
            product *= i;
        return product;
    }
}
