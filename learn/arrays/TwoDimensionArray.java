package com.learn.arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] myarr= new int[2][3];
        myarr[0][0] = 9;
        //System.out.println(myarr);
        //traversal
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0].length);
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}