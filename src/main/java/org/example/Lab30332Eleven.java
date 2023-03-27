package org.example;
import java.util.Scanner;
public class Lab30332Eleven {
    public static void main(String[] args){
        /* CREATE ARRAY */
        String[] array;

        /* PROMT USER */
        int input;
        System.out.println("How many favorite things: ");
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextInt();
        keyboard.nextLine();

        /* INITIALIZE ARRAY */
        array = new String[input];


        for(int i = 0; i <= array.length - 1; i++){
            System.out.println("Enter favorite thing: ");
            array[i] = keyboard.nextLine();
        }

        System.out.println("Here is a list of your favorite things. ");

        for(String line : array ){
            System.out.println(line);
        }
    }
}
