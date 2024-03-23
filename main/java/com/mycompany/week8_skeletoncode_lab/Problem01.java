/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n) {
        long sum = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            //check if its prime
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            //add if its prime
            if (isPrime) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {


        int n= 20;
        //print results
        System.out.println("Sum of the primes between 1 and "+n+" is: "+ getSumOfPrimes(n));

    }
}

    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time

    //        the time complexity for this algorithm would be O(√n)
   //         because each iteration the code checks if its prime by calculating the square root



    

