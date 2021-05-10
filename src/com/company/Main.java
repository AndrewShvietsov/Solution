package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();

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
        main.maxMinArray(array, isMax);

        System.out.println("Enter array length: ");
        int lines = scanner.nextInt();
        System.out.println("Enter array columns: ");
        int columns = scanner.nextInt();
        int array1[][] = new int[lines][columns];
        System.out.println("Enter array elements:");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Max?");
        isMax = scanner.hasNextBoolean();
        if (isMax) {
            System.out.println(isMax);
        }
        main.maxMinArray(isMax, array1);
    }

    Scanner scanner = new Scanner(System.in);

        public int maxMinArray(int[] array, boolean isMax) {
            int result = array[0];
            for (int i = 1; i < array.length; i++) {
                if (isMax == true) {
                    if (array[i] > result) {
                        result = array[i];
                    }
                } else {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
            }
            System.out.println((isMax == true ? "Max is equal - " : "Min is equal - ")+result);
            return result;
        }

    public int maxMinArray(int[][] array, boolean isMax) {
        int result = array[0][0];
        for (int i = 1; i < array.length; i++) {
            int tempResult = maxMinArray(array[i], isMax);
            result = isMax == true ? (result < tempResult ? tempResult : result) : (result < tempResult ? tempResult : result);
            }

        System.out.println((isMax == true ? "Max is equal - " : "Min is equal - ")+result);
        return result;
    }

    public int maxMinArray(boolean isMax, int[][] array) {
        int result = array[0][0];
        int[] tempArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            tempArray[i] = maxMinArray(array[i], isMax);
        }
        result = maxMinArray(tempArray, isMax);

        System.out.println((isMax == true ? "Max is equal - " : "Min is equal - ")+result);
        return result;
    }
        

    }




