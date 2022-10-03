/*
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.
*/

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
         NumberFormat us1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = us1.format(payment);
       NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = ind.format(payment);
        NumberFormat chi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chi.format(payment);
        NumberFormat fra = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fra.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
