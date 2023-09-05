import java.util.ArrayList;

public class Board {
    private Integer n; // number of cells
    private ArrayList<Integer> transferList;

    public Board(Integer n) {
        this.n = n;
        transferList = new ArrayList<>(n);
    }
}
