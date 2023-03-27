package org.example;
import java.util.Arrays;
public class Lab30332Three {
    public static void main(String[] args){
        String[] array = {"red", "green", "yellow"};

        System.out.println(array.length);

        String[] copy = array.clone();

        System.out.println(Arrays.toString(copy));
    }

}
