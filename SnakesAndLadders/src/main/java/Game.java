import java.util.ArrayList;

public class Game {

    private Board board;
    private ArrayList<Player> players;
    private Dice dice;

    public Game(Board board, ArrayList<Player> players, Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
    }

    public static void main(String[] args) {
        Board myBoard = new Board(100);
        Player playerA = new Player("A", 0);
        Player playerB = new Player("B", 0);

        ArrayList<Player> players = new ArrayList<>();
        players.add(playerA);
        players.add(playerB);

        Dice myDice = new Dice(1, 6);

        Game myGame = new Game(myBoard, players, myDice);


        System.out.println("Hello");
    }
}
