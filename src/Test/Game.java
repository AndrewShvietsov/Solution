package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

    private String count;

    public static void main(String[] args) {
        Game play = new Game();
//        play.count = -3;
    }

    public int getCount() {
        return Integer.valueOf(count);
    }

    public void setCount(int count) {
        if (count < 1 || count > 4) {
            System.out.println("Mistake count of players");
            return;
        }
        this.count = String.valueOf(count);

    }
}
class Player {
    public static void main(String[] args) {
        Game play = new Game();
        play.setCount(3);
        System.out.println(play.getCount());
    }
}





