package Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int[] array = {5, 10, 88, 7, 3};
        try {
            System.out.println(array[10]);
            System.out.println(b / a);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            if (e.getClass().equals(ArithmeticException.class)) {
            if (e instanceof ArithmeticException) {
                System.out.println("Catch 1");
            } else {
                System.out.println("Catch 2");
            }
        }
    }
}
//
////        Algoritmic algoritm = new Function1();
////        algoritm = new Algoritmic() {
////            @Override
////            public int function(int element) {
////                System.out.println(element);
////                return 0;
////            }
////        };
////
////        algoritm.function(2);
////
////        Solution sol = new Solution();
////        int[] mas = {10,12,7};
////        System.out.println(sol.test(mas,2));
//
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        map.put()
//        int[][] a = {{1, 2, 3}, {1, 2}, {1, 3, 5, 7}};
//        int[][] b = {{7, 0, 5, 8, 2}, {3, 3}};
//        System.out.println(test(a, b));
////
////
//////        System.out.println(Arrays.toString(sol.findSameElements(20, 15, 12, 20)));
//////   }
////}
//        private static Set<Integer> test ( int[][] a, int[][] b){
//            Set<Integer> set = new HashSet<Integer>();
//            Set<Integer> intersection = new HashSet<Integer>();
//            for (int[] s : a) {
//                set.add(s);
//            }
//            for (int[] s : b) {
//                if (set.contains(s)) {
//                    intersection.add(s);
//                }
//            }
//            return intersection;
//        }
//    }
//}

//
//    public int test(int[] mas) {
//
//        int sum = 0;
//        for (int i = 0; i < mas.length; i++) {
//            sum = sum + mas[i];
//        }
//        return sum;
//    }
//    public int test(int[] mas, int pav){
//        int sum=0;
//        for(int i=0;i<mas.length;i++){
//        if(mas[i] % pav == 0){
//        sum+=mas[i];
//        }
//        }
//        return sum;
//
//    }
//    public int[] findSameElements(int start1, int end1, int start2, int end2) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//
//        int myStart1 = start1 > end1 ? end1 : start1;
//        int myEnd1 = start1 > end1 ? start1 : end1;
//        int myStart2 = start2 > end2 ? end2 : start2;
//        int myEnd2 = start2 > end2 ? start2 : end2;
//
//
//        for (int i = myStart1; i <= myEnd1; i++) {
//            if (i >= myStart2 && i <= myEnd2) {
//                result.add(i);
//            }
//        }
//        int[] mas = new int[result.size()];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = result.get(i);
//        }
//        return mas;
//    }
//}
//@FunctionalInterface
//interface Algoritmic {
//    abstract int function(int element);
//    default void one() {
//        System.out.println("работает реализация default");
//    }
//}
//class Function1 implements Algoritmic {
//
//    @Override
//    public int function(int element) {
//        return 5*element+3;
//    }
//}
