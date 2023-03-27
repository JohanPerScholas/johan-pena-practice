package org.example;

import java.util.Arrays;

public class Lab30332Nine {
    public static void main(String[] args){
        /* CREATE ARRAY */
        int[] array = {4, 2, 9, 13, 1, 0};

        /* CREATE VARIABLES BIGGEST AND SMALLEST */
        int smallest = 0;
        int biggest = 0;
        int placeHolder = 0;

        /* GO THROUGH ARRAY */
        for(int i = 0; i <= array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    placeHolder = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = placeHolder;
                }
            }
        }

        smallest = array[0];
        biggest = array[array.length - 1];

        System.out.println(Arrays.toString(array));
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The smallest number is: " + smallest);
    }
}
