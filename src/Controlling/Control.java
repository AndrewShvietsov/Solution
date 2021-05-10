package Controlling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Control {

    public static void main(String[] args){
        try {


            Control control = new Control();
            String letter = control.replaceLetter2("Hemlo", 'm', 'l');
            System.out.println(letter);

            String str = "Love";
            str = null;
            System.gc();
//        int a = 5/0;
//        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
//                int n = 10/0;
                String s = "qwerty";
                System.out.println(s.charAt(12));
                System.out.println("***");
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("Block catch is working");
            } catch (ArithmeticException e) {
                System.err.println("Error****");
                int n = 10 / 2;
                System.out.println("***");
                System.exit(1);
            } finally {
                System.out.println("Finally 1");
            }
            System.out.println("After");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out Catch");
        }finally {
            System.out.println("Finally 2");
        }
//            str += i;
//            System.out.println(str);
        }


    String replaceLetter2(String source,char letterOld,char letterNew){
        StringBuilder result = new StringBuilder();
        int[] positionsLetter = findPosition(source, letterOld);
        int end = source.length();
        int start = 0;
        for (int position : positionsLetter) {
            result.append(source.substring(start,position)).append(letterNew);
            start = position + 1;
        }
        result.append(source.substring(start,end));
        return result.toString();
    }




    private int[] findPosition(String source, char letterOld) {

        int count = getCountOldLetter(source, letterOld);
        int[] result=new int[count];
        for (int k = 0, j = 0; j < source.length() ; j++) {
            if(letterOld == source.charAt(j)){
            result[k]=j;
                k++;
        }
    }
     return result;
}


private int getCountOldLetter(String source, char letterOld) {
        int result=0;
    for (char temp: source.toCharArray() ) {
        if (temp == letterOld){
            result++;
        }
    }
        return result;
        }
        public int calculateTemperature(Map<String, List<Integer>> listMap) {
        int result = 0;
        int count = 0;
        int totalTemp = 0;
        for (String key : listMap.keySet()) {
            List<Integer> data = listMap.get(key);
            count += data.size();
            try {
                totalTemp += sumTemp(data, key);
            } catch (TempException e) {
                e.printStackTrace();
            }
        }

        return result;
        }

    private int sumTemp(List<Integer> data, String name) throws TempException {
        int result = 0;
        for (int temp : data) {
            result += temp;
            if (temp < 35 || temp > 42) {
                throw new TempException("Allow", temp, name);
            }
        }
        return result;
    }

}

class TempException extends Exception {
    int value;
    String name;

    public TempException(String message, int value, String name) {
        super(message);
        this.value = value;
        this.name = name;
    }
}






//Control control = new Control();
//control.replaceLetter4("Hemlo", 'm', 'l');
//        System.out.println(control.toString());
//    }
//
//    String replaceLetter4(String source, char letterOld, char letterNew) {
//
//        StringBuilder sb = new StringBuilder(source);
//
//        StringBuffer sbf = new StringBuffer(sb.toString().replace(letterOld, letterNew));
//
//        String result = "";
//
//        sb = sb.reverse();
//
//        result = sbf.reverse().toString();
//
//        return result;
//
//    }
//}


//        String replaceLetter1(String source, char letterOld, char letterNew) {
//
//            int position = source.indexOf(letterOld);
//
//            StringBuilder result = new StringBuilder(source);
//
//            while (position != -1) {
//                result = result.replace(position, position + 1, String.valueOf(letterNew));
//                position = result.toString().indexOf(letterOld);
//                System.out.println(result);
//            }
//            return result.toString();
//        }
//}




