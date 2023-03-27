package org.example;

public class Lab30332Seven {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int middle = array.length/2;

        for(int i = 0; i <= array.length - 1; i++){
            if(i == middle){
                continue;
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
