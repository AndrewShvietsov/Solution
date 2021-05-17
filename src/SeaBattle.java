import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeaBattle {
    List<Player> list = new ArrayList<>();
    int[] ships = new int[]{1,1,1,1, 2,2,2, 3,3, 4};

    public SeaBattle(Player player1, Player player2) {
        this.list.add(player1);
        this.list.add(player2);
        player1.shipsStartPosition(ships);
        player2.shipsStartPosition(ships);
        playGame();
    }

    private void playGame() {
    }

    public static void main(String[] args) {
        LocalDate data=LocalDate.of(2021, Month.DECEMBER,31);
    }
}

class Player {
    String name;
    int[][] myField = new int[10][10];
    int[][] enemyField = new int[10][10];

    public boolean shot(Player enemy, int row, int column) {
        stateCell myResult = enemy.getResultAfterShooting(row, column);
        boolean result = myResult == stateCell.Injured || myResult == stateCell.Killed;
        return result;
    }

    public stateCell getResultAfterShooting(int row, int column) {
      return null;
    }

    public void shipsStartPosition(int[] shipPlays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < shipPlays.length; i++) {
            System.out.println("Setting place "+shipPlays[i]+" ship");
            System.out.println("Row- ");
            int row =scanner.nextInt();
            System.out.println("Column- ");
         //   int

        }
    }
}

enum stateCell {
   Init(0), Engage(1), Milk(2),Injured(3),Killed(4);
    int znakState;
    stateCell(int znakState) {
      this.znakState=znakState;
    }
}





