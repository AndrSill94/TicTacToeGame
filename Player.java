/**
 * the class imitates the player
 */
public class Player {
    private String name;
    private String playerSelect;

    public Player(String name) {
        this.name = name;
        this.playerSelect = "";
    }

    public Player(String name, String playerSelect) {
        this.name = name;
        this.playerSelect = playerSelect;
    }

    public String getPlayerSelect() {
        return playerSelect;
    }

    public void setPlayerSelect(String playerSelect) {
        this.playerSelect = playerSelect;
    }

    public String makeAmove() {
        return getPlayerSelect();
    }

    public String getName() {
        return name;
    }
}
