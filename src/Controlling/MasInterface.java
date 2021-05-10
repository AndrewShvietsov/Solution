package Controlling;

import Testing.Solution;

import javax.xml.catalog.Catalog;
import java.util.*;

public class MasInterface {
    public static void main(String[] args) {
        MasInterface mas = new MasInterface();
        int[] array = {10, 20, 30, 40, 40, 40, 25, 25, 10, 20, 100};
        mas.collect(array);
        mas.collect1(array);
    }

        public void collect () {
            int[] mas = {10, 20, 30, 40, 40, 40, 25, 25, 10, 20};
            List<Integer> myArray = new ArrayList<Integer>();
            for (int i = 0; i < mas.length; i++) {
                myArray.add(mas[i]);

            }

            Map<Integer, Integer> ss = new HashMap<Integer, Integer>();
            for (int i = 0; i < mas.length; i++) {
                ss.put(mas[i], Collections.frequency(myArray, mas[i]));
            }
            System.out.println(ss);
    }
    public void collect (int[] massive) {
        String accumulator = "";
        for (int i = 0; i < massive.length; i++) {
            int count = 0;
            for (int element : massive) {
                if (element == massive[i]) {
                    count++;
                }
            }
            if (!accumulator.contains(massive[i] + "-" + count)) {
                accumulator = accumulator + (massive[i] + "-" + count) + ",";

            }
        }
        System.out.println(accumulator);
    }
    public void collect1 (int[] massive) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int temp : massive) {
            if (map.get(temp) == null) {
                map.put(temp, 1);
            } else {
                int count = map.get(temp);
                map.put(temp, ++count);
            }
        }
        System.out.println(map);
    }
}




//    int [][] mas = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = mas[i][j] % 2 == 0 ? mas[i][j] * 33 : mas[i][j] * 51;
//                System.out.println(mas[i][j]);
//            }
//        }





//        MyArray mas = new MyArray();
//        mas.train(" is training");
//    }
//}
//
//interface List {
//    void train(String training);
//}
//
//class MyArray implements List {
//    static String[] sportsmenList = {"Bob", "Alex", "Richard"};
//
//    @Override
//    public void train(String training) {
//        for (String string : sportsmenList) {
//            System.out.println(string + training);
//        }
//    }






