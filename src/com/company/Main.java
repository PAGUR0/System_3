package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] N_array = new int[scanner.nextInt()];

        int[][] Array_quantity = new int[15][2];

        for(int i = 0; i < N_array.length;i++){
            N_array[i] = random.nextInt(15);
            Array_quantity[N_array[i]][1]++;
            if(i < 15){
                Array_quantity[i][0] = i+1;
            }
        }
        selectionSort(Array_quantity);
        System.out.println(Array_quantity[14][0] +" "+ Array_quantity[14][1]);
        System.out.println(Array_quantity[13][0] +" "+ Array_quantity[13][1]);
        System.out.println(Array_quantity[12][0] +" "+ Array_quantity[12][1]);

    }

    public static void selectionSort(int[][] sortArr){
        for (int i = 0; i < sortArr.length; i++){
            int min_id = i;
            int min = sortArr[i][1];
            int[] minArr = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j][1] < min) {
                    min_id = j;
                    min = sortArr[j][1];
                    minArr = sortArr[j];
                }
            }
            sortArr[min_id] = sortArr[i];
            sortArr[i] = minArr;
        }
}}
