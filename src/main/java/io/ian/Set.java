package io.ian;

public class Set {

    private Integer[] setData;

   public Set(Integer... numbers) {

        int indexCounter = 0;
        Integer[] data = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            boolean nullCheck = false;
            for (int h = i + 1; h < (numbers.length - i); h++) {
                if (numbers[i] == numbers[h]){
                    data[i] = null;
                    break;
                } else {
                    nullCheck = true;
                }
            }
            if (nullCheck == true){
                data[i] = numbers[i];
                indexCounter++;
            }
        }

       Integer[] newData = new Integer[indexCounter];

       int adjustIncrement = 0;
       for (int i = 0; i < data.length; i++){

            if (data[i] == null){
                adjustIncrement++;
            } else {
                newData[(i - adjustIncrement)] = data[i];
            }
        }
        this.setData = newData;
    }

    public void add(Integer number){
        Boolean isDuplicate = false;
        for (int i = 0; i < this.setData.length; i++) {
            if (number == this.setData[i]){
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate == true){
            System.out.println("Error: Duplicate entry");
        } else {
            Integer[] data = new Integer[this.setData.length + 1];

            for (int i = 0; i < this.setData.length; i++) {
                data[i] = this.setData[i];
            }
            data[this.setData.length + 1] = number;
            this.setData = data;
        }
    }

    public void remove(Integer number){
        Integer[] data = new Integer[this.setData.length - 1];
        Boolean adjustIncrement = false;

        for (int i = 0; i < this.setData.length; i++) {

            if (number == this.setData[i]){
               adjustIncrement = true;
            } else if (adjustIncrement == true) {
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