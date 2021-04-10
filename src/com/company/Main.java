package com.company;
import java.util.Scanner;


public class Main {

    Scanner scanner = new Scanner(System.in);

        public void maxMinArray(int[] array) {
            System.out.println("Enter array length: ");
            int size = scanner.nextInt();
            int array1[] = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Max?");

            boolean isMax = scanner.hasNextBoolean();
            if (isMax) {
                System.out.println(isMax);
            }


            System.out.println("Min?");

            boolean isMin = scanner.hasNextBoolean();
            if (isMin) {
                System.out.println(isMin);
            }

            int max = array1[size];
            int min = array1[size];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[max]) {
                    max = i;
                } else if (array[i] < array[min]) {
                    max = i;
                }
            }
        }

        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                System.out.println("Enter array length: ");
                int size = scanner.nextInt();
                int array[] = new int[size];
                System.out.println("Enter array elements:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }

            System.out.println("Max?");

            boolean isMax = scanner.hasNextBoolean();
            if (isMax) {
                System.out.println(isMax);
            }


            System.out.println("Min?");

            boolean isMin = scanner.hasNextBoolean();
            if (isMin) {
                System.out.println(isMin);
            }

            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                } else if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println ("Min is " + min);
            System.out.println ("Max is " + max);




            }
        }
//        System.out.print("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print(" " + array[i]);
//        }
//        System.out.println();
