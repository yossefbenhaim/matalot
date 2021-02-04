package com.company;

public class Main {

    //matala 1
        public static void decToBin ( int dec){
            int num;
            String bin = "";
            while (dec > 0) {
                num = dec % 2;
                dec /= 2;
                String temp = Integer.toString(num);
                bin = temp + bin;
            }
            System.out.println(bin);
        }
    //matala 2
    public static int closestRandom(int input){
        int rand;
        int min = 0;
        int diffMin = 0;
        int diff;
        for (int i=0; i<5; i++){
            rand = (int) ((Math.random() * 100)+1);
            diff = Math.abs(input - rand);
            if(i==0) {
                diffMin = diff;
                min = rand;
            }
            if(diff < diffMin) {
                min = rand;
                diffMin = diff;
            }
        }
        return min;
    }
    //matala 3
    public static int factorial(int num){
        int factorial = 1;
        for(int i = num; i>0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
