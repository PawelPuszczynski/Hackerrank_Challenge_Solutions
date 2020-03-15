package com.company;

public class Main {

    public static void main(String[] args) {
        int [] ar = {1,2,3,4,10,11};

        System.out.println(simpleArraySum(ar));
    }



    public static int simpleArraySum (int[]ar){
        int sum=0;
        for (int value : ar) {
            sum += value;

        }
        return sum;
    }
}