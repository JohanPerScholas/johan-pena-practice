package org.example;

public class Lab30332Four {
    public static void main(String args[]) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(array[0]);
        System.out.println(array[array.length-1]);

        /*
            THE FOLLOWING CODE WILL CAUSE AN ERROR!
            --------------------------------------------
            - System.out.println(array[array.length]);
         */

        /*
            THE FOLLOWING CODE WILL CAUSE AN ERROR!
            --------------------------------------------
            - array[5] = 7;
         */
    }
}
