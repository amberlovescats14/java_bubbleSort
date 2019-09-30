package com.amber;

public class Main {

    public static void main(String[] args) {
	    //print array
//        for(int i=0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }
    public static int[] bubbleSort(int [] arr){
        //new array
        int[] sortingArray = new int[arr.length];
        //assign the variable array to sortingArray
        for(int i=0; i< sortingArray.length-1; i++){
            sortingArray[i] = arr[i];
        }
        //set variables
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortingArray.length-1; i++){
                if (sortingArray[i] < sortingArray[i+1]) {
                    temp = sortingArray[i];
                    sortingArray[i] = sortingArray[i+1];
                    sortingArray[i+1] = temp;
                    flag = true;
                }
            }
        }

    }
}
