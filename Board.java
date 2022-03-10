import java.util.ArrayList;

/**
 * Class Board
 * main class to simulate the playing field
 */
public class Board {
    private String playerName;
    private ArrayList<String> elements = new ArrayList<String>();
    private String board;
    private static int boardCounter = 0;

   public Board() {
       for(var i = 1; i < 11; i++) {
           String defaultElement = Integer.toString(i);
           this.elements.add(defaultElement);
       }

       board = String.format("""
                          +=========+|
                          |%s||%s||%s|
                          |%s||%s||%s|
                          |%s||%s||%s|
                          ============
                           """, elements.get(0), elements.get(1), elements.get(2), elements.get(3),
                                elements.get(4), elements.get(5), elements.get(6), elements.get(7),
                                elements.get(8), elements.get(9)
       );
   }


    public String getBoard() {
        return board;
    }


    /**
     *
     * @param elementIndex
     * @param value
     */
    public void inputElement(int elementIndex, String value) {
       this.elements.set(elementIndex-1, value);
       board = String.format("""
                          +=========+|
                          |%s||%s||%s|
                          |%s||%s||%s|
                          |%s||%s||%s|
                          ============
                           """, elements.get(0), elements.get(1), elements.get(2), elements.get(3),
                elements.get(4), elements.get(5), elements.get(6), elements.get(7),
                elements.get(8), elements.get(9)
       );
       boardCounter += 1;
    }

    public static int getBoardCounter() {
        return boardCounter;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    //2 4 6

    /**
     *checks the rules of the game
     * @return
     */
    public boolean winCheck() {
        ArrayList<String> checkRules = getElements();
        boolean result = false;
        if(checkRules.get(0) == checkRules.get(1) && checkRules.get(1) == checkRules.get(2)) {
            result = true;
        } else if(checkRules.get(3) == checkRules.get(4) && checkRules.get(4) == checkRules.get(5)) {
            result = true;
        } else if(checkRules.get(6) == checkRules.get(7) && checkRules.get(7) == checkRules.get(8)) {
            result = true;
        } else if(checkRules.get(0) == checkRules.get(3) && checkRules.get(3) == checkRules.get(6)) {
            result = true;
        } else if(checkRules.get(1) == checkRules.get(4) && checkRules.get(4) == checkRules.get(7)) {
            result = true;
        } else if(checkRules.get(2) == checkRules.get(5) && checkRules.get(5) == checkRules.get(8)) {
            result = true;
        } else if(checkRules.get(0) == checkRules.get(4) && checkRules.get(4) == checkRules.get(8)) {
            result = true;
        } else if(checkRules.get(2) == checkRules.get(4) && checkRules.get(4) == checkRules.get(6)) {
            result = true;
        }
        return result;
    }

}
