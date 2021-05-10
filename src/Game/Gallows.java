package Game;

import Test.Game;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Gallows {

    int countMistake = 0;
    final int MAX_COUNT_MISTAKE_ERROR = 10;
    int countStars;

    public static void main(String[] args) {
        Gallows gallows = new Gallows();
        gallows.play();
    }

    public void play() {
        String[] dictionary = {"house", "lion", "sunshine", "amazing"};
        Random rand = new Random();
        int index = rand.nextInt(dictionary.length - 1);
        String word = dictionary[index];

        String stars = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append("*");
        }
        stars = sb.toString();
        System.out.println(stars);

        System.out.println();


        Scanner reader = new Scanner(System.in);
        this.countStars = word.length();
        while (countMistake < MAX_COUNT_MISTAKE_ERROR && countStars != 0) {
            System.out.println("Enter the letter: ");
            String n = reader.nextLine();
            stars = changeStar(word, stars, n);
            System.out.println(countStars);
            System.out.println(stars);
        }
        if (countMistake < MAX_COUNT_MISTAKE_ERROR) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Game over");
        }
    }

    public String changeStar(String etalon, String replace, String letter) {
        boolean isGood = false;
        for (int i = 0; i < etalon.length(); i++) {
            char character = etalon.charAt(i);
            if (character == letter.charAt(0)) {
                replace = replaceToLetter(i, replace, letter);
                isGood = true;
            }
        }

        if (!isGood) {
            this.countMistake++;
        }
        return replace;
    }

    private String replaceToLetter(int position, String replace, String letter) {
        char[] array = replace.toCharArray();
        array[position] = letter.charAt(0);
        String result = new String(array);
        countStars--;
        return result;
    }
}

