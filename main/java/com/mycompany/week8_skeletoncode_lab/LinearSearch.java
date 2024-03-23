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
public class LinearSearch {
    
    public static int search(int arr[], int x) {
        int n = arr.length;

        //linear search
        for (int i=0;i<arr.length;i++){
            if(arr[i]== x) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        //add elements in arr
        int[] arr = new int[]{3, 6, 9, 11, 13, 16};


            //display numbers in the array
            System.out.println("NUMBERS: ");
            for(int num: arr){
                System.out.print(num+ " ");
            }

            System.out.println();
            //ask the user to enter a value from the arr
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter a value: ");
            int x = scnr.nextInt();

           int index=search(arr,x);

            if(index != -1){
                System.out.println("Element found at index: "+ index);
            } else {
                System.out.println("Element was not found.");
            }

        }


    }


// Todo 01: - complete the implementation of linear search and test your code
//         - provide asymptotic analysis of the developed solution
//     Time complexity for this algorithm is O(n) because it iterates in each array element until it finds the element asked

    

