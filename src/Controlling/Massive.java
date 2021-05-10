package Controlling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Massive {
    public static void main(String[] args) {
        Massive mass = new Massive();
        mass.mas(new int[]{1,2,3,5,9}, new int[]{1,3,5,8});
    }

    public void mas(int[] masA, int masB[]) {
        for (int i = 0; i < masA.length; i++) {
            if (!isFind(masA[i], masB)) {
                System.out.println(masA[i]);
            }
        }
        for (int i = 0; i < masB.length; i++) {
            if (!isFind(masB[i], masA)) {
                System.out.println(masB[i]);
            }
        }
    }

    private boolean isFind(int element, int[] masA) {
        boolean result = false;
        for (int i = 0; i < masA.length; i++) {
            if (element == masA[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
}

//        Massive mas = new Massive();
//        int[] arr = {1,2,3,5,15};
//            mas.sumArray(arr, 5);
//    }
//    public int sumArray(int[] array33, int secondParameter) {
//        int sum = 0;
//        try {
//        for (int i = 0; i < array33.length; i++) {
//            sum += array33[i];
//            if (sum > secondParameter) {
//                throw new SumException(i);
//
//            }
//        }
//        } catch (SumException e) {
//            int[] temp = Arrays.copyOf(array33, e.index);
//            System.out.println( sumArray(temp, secondParameter));
//        }
//        return sum;
//    }
//}
//
//class SumException extends Exception {
//    int index;
//    public SumException(int index) {
//        this.index = index;
//    }
//}










//    public static void main(String[] args) {
//        Massive mas = new Massive();
//        int[] arr = {1,2,3,5,7};
//        mas.sumArray(arr, 20);
//    }
//    public int sumArray(int[] array, int secondParameter) {
//        int sum = 0;
//        int i = 0;
//        for (int value : array) {
//            sum += value;
//
//            if (sum > secondParameter) {
//                try {
//                    throw new myException(i);
//                } catch (myException e) {
//                    sum = sum - array[e.index];
//                    System.out.println(sum);
//                    return sum;
//                }
//            }
//            i++;
//        }
//
//        System.out.println(sum);
//        return sum;
//    }
//}
//class myException extends Exception {
//    int index = -1;
//    public myException(int index) {
//        this.index = index;
//    }
//}