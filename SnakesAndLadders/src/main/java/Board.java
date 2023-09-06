import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board {
    private Integer n; // number of cells
    private ArrayList<Integer> redirect;

    public Board(Integer n) {
        this.n = n;
        redirect = new ArrayList<>(n + 1);

        for(Integer i = 0; i <= n; i++) {
            redirect.add(i);
        }
    }

    public Integer getWinnerPosition() {
        return this.n;
    }
    public Integer getPosition(Integer c) {
        if(c >= n) {
            System.out.println("WINNER!");
            return this.n;
        }
        return this.redirect.get(c);
    }
    public void setRedirect(Integer from, Integer to) {
        if(from < 0 || from > n || to < 0 || to > n) {
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }

        this.redirect.set(from, to);
    }
    public void print() {
        // print board in rows containing 10 cells
        Integer i = 1;
        Boolean isReverse = true;
        while(i <= n) {
            // get 10 cells
            ArrayList<ArrayList<Integer>> row = new ArrayList<>();
            for(Integer j = 0; j < 10 && i <= n; j++, i++) {
                row.add( new ArrayList<>(Arrays.asList(i, redirect.get(i))) );
            }
            if(isReverse) {
                Collections.reverse(row);
            }
            for(ArrayList<Integer> cell : row) {
                System.out.print(cell.get(0) + "," + cell.get(1) + "\t\t");
            }
            System.out.println();
            isReverse = !isReverse;
        }
    }
}
