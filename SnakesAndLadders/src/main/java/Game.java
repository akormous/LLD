import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Game {

    private Board board;
    private Queue<Player> playerQueue;
    private Dice dice;
    private Boolean isCompleted;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.playerQueue = new LinkedList<>();
        this.isCompleted = false;
    }

    public void addPlayer(Player player) {
        this.playerQueue.add(player);
    }

    public void play(Player player) {
        if(playerQueue.peek() != player) {
            System.out.println("Not your turn " + player.getName());
            return;
        }
        Integer steps = dice.roll();
        Integer curPosition = player.getPosition();
        player.setPosition(board.getPosition(curPosition + steps) );

        // put player at the end of the queue
        this.playerQueue.poll();
        this.playerQueue.add(player);

        System.out.println(player.getName() + " moved from " + curPosition + " to " + player.getPosition());

        if(player.getPosition() == board.getWinnerPosition()) {
            this.isCompleted = true;
        }
    }

    public void simulate() {
        while(!this.isCompleted) {
            play( this.playerQueue.peek() );
        }
    }

    public static void main(String[] args) {
        // create a snakes and ladders board
        Board myBoard = new Board(100);
        myBoard.setRedirect(7, 22);
        myBoard.setRedirect(67, 3);
        myBoard.setRedirect(12, 98);
        myBoard.setRedirect(78, 32);

        // create a dice
        Dice myDice = new Dice(1, 6);

        // create players and add them to game
        Player playerA = new Player("A", 0);
        Player playerB = new Player("B", 0);

        Game myGame = new Game(myBoard, myDice);

        // add players to game
        myGame.addPlayer(playerA);
        myGame.addPlayer(playerB);

        myGame.simulate();

    }
}
