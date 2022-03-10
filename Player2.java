public class Player2 extends Player{
    public Player2(String name, String select) {
        super(name, select);
    }

    public Player2(String name) {
        super(name);
    }

    @Override
    public String makeAmove() {
        return super.getPlayerSelect();
    }
}
