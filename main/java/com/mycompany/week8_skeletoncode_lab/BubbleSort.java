/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int[] a, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) {// bubbling up
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1]; //update
                    a[inner + 1] = temp;  //update
                }
            }
        }

    }

    public static void main (String[]args){
            //add elements to the array
            int[] a = {8, 6, 17, 1, 15, 5};



             bubbleSort(a, a.length);
        //print the new array after bubblesort run
            System.out.println("After sorting:");
            for (int num : a) {
            System.out.print(num + " ");
        }
            //ToDo 3: complete this algorithm, test it, provide its time complexity

            // Time complexity for this algorithm is O(n^2) because outer loop iterates n=the number of elements,
           //the inner loop also runs till the outer n


        }
}

