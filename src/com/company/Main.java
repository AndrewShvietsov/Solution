package com.company;
import java.util.Scanner;


public class Main {

        public void maxMinArray(int[] array) {
            Scanner scanner = new Scanner(System.in);
            int maximum = scanner.nextInt();
            int max = 0;
            int min = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[max]) {
                    max = i;
                } else if (array[i] < array[min]) {
                    max = i;
                }
            }
        }


        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter array length: ");
            int size = scr.nextInt();
            int array[] = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scr.nextInt();
            }
            Main sol = new Main();
            sol.maxMinArray(array);
        }
    }
//        System.out.print("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(" " + array[i]);
//        }
//        System.out.println();


