package io.ian;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the numbers you would like to add");
        System.out.println("Input done when you are finished");

        ArrayList<Integer> toAdd = new ArrayList<Integer>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("done")){
                break;
            }
           Integer intInput = Integer.parseInt(input);
            toAdd.add(intInput);
        }

        Integer[] setNums = new Integer[toAdd.size()];
        for (int i = 0; i < toAdd.size(); i++){
            setNums[i] = toAdd.get(i);
        }

        Set mySet = new Set(setNums);

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
                Integer intInput = scanner.nextInt();
                mySet.add(intInput);

            } else if (input.equals("remove")){
                System.out.println("Input an integer to remove");
                Integer intInput = scanner.nextInt();
                mySet.remove(intInput);
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
