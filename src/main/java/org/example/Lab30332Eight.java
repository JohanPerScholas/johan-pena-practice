package org.example;
import java.util.Arrays;
public class Lab30332Eight {
    public static void main(String[] args){
       String[] array = {"one", "two", "three", "four", "five"};

       System.out.println(Arrays.toString(array));

       String a = array[0];
       String b = array[2];

       array[0] = b;
       array[2] = a;

       System.out.println(Arrays.toString(array));

    }
}
