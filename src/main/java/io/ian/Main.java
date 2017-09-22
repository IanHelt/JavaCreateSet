package io.ian;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        Set mySet = new Set(1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 3, 9, 10);

        System.out.println("Inputs:");
        System.out.println("add - prompts user for an integer to add");
        System.out.println("remove - prompts user for an integer to remove");
        System.out.println("values - returns all values currently stored");
        System.out.println("size - returns rhe size of the set");
        System.out.println("done - exits process");

        while (true){
            String input = scanner.nextLine();
            if (input.equals("add")){
                System.out.println("Input an integer to add");
                mySet.add();
            } else if (input.equals("remove")){
                System.out.println("Input an integer to remove");
                mySet.remove();
            } else if (input.equals("values")){
                mySet.values();
            } else if (input.equals("size")){
                mySet.getSize();
            } else if (input.equals("done")){
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
