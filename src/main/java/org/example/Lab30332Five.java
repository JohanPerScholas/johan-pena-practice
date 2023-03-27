package org.example;

import java.util.Arrays;

public class Lab30332Five {
    public static void main(String[] args){
        int[] array = new int[5];

        for(int i = 0; i <= array.length - 1; i++){
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
    }
}
