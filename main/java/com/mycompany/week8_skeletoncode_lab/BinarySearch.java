/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/*
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main (String[] args){
        //add numbers to the array
        int []  array ={ 2,4,5,8,12,16,18};

        //display numbers in the array
        System.out.println("NUMBERS: ");
        for(int num: array){
            System.out.print(num+ " ");
        }

        System.out.println();

        //ask the user to enter a value from the numbers to find the index
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int key= scnr.nextInt();

        //call method
       int index= runBinarySearchIteratively(array, key, 0, array.length -1);

       //print the index of the element
             if(index != -1){
                 System.out.println("Element found at index: "+ index);
             } else {
                 System.out.println("Element was not found.");
             }

    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis
    //Time complexity of this algorithm is O(log n) because each iteration of the while loop and the array is divided to
    //fing the middle index,the number of iterations to find the element index is proportional to the long n

    //Space Complexity is O(1) because in this algorithm theres only a fix number of integers
}
