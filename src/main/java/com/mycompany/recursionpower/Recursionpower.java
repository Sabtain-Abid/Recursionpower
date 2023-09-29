/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursionpower;

/**
 *
 * @author Hp
 */
public class Recursionpower {

   public static double power(double base , int exponent)
   {
       if(exponent == 0)
       {
           return 1; 
       }
       else if(exponent > 0)
               {
                   return base * power(base,exponent-1);
               }
      
       else
       {
           return 0;
       }
   }
    public static void main(String[] args) {
            double        base =5;
        int exponent =3;
        
        double result = power(base, exponent);
        System.out.print( base+ " and the power is " +exponent+" result is " +result);
    }
}
