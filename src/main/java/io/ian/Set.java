package io.ian;


import java.util.ArrayList;
import java.util.Scanner;

public class Set {
    Scanner scanner = new Scanner(System.in);
    private Integer[] setData;

   public Set(Integer... numbers) {
       ArrayList<Integer> duplicates = new ArrayList<Integer>();
       ArrayList<Integer> toSet = new ArrayList<Integer>();
       for (int i = 0; i < numbers.length; i++) {
           boolean isDuplicate = false;
           for (int j = i + 1; j < numbers.length; j++) {
               if (numbers[i] == numbers[j]){
                   isDuplicate = true;
               }
           }
           if (isDuplicate){
               duplicates.add(numbers[i]);
           } else {
               toSet.add(numbers[i]);
           }
       }
       System.out.println("Duplicates found: " + duplicates.toString());
       this.setData = toSet.toArray(new Integer[toSet.size()]);
   }




    public void add(){
        Integer number = scanner.nextInt();
        Boolean isDuplicate = false;
        for (int i = 0; i < this.setData.length; i++) {
            if (number == this.setData[i]){
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate){
            System.out.println("Error: Duplicate entry");
        } else {
            Integer[] data = new Integer[(this.setData.length + 1)];
            for (int i = 0; i < this.setData.length; i++) {
                data[i] = this.setData[i];
            }
            data[data.length - 1] = number;
            System.out.println("Successfully added " + number);
            this.setData = data;
        }
    }

    public void remove(){
        Integer number = scanner.nextInt();
        Integer[] data = new Integer[this.setData.length - 1];
        Boolean adjustIncrement = false;
        System.out.println("Another message will display after this message if " + number + " is found and removed");
        for (int i = 0; i < this.setData.length; i++) {

            if (number == this.setData[i]){
                System.out.println(number + " Successfully removed");
               adjustIncrement = true;
            } else if (adjustIncrement) {
                data[(i - 1)] = this.setData[i];

            }else{
                data[i] = this.setData[i];
            }
        }
        this.setData = data;
    }

    public Integer getSize(){
        System.out.println(this.setData.length);
        return this.setData.length;
    }

    public void values(){
        for (Integer number:this.setData) {
            System.out.println(number);
        }
    }
}