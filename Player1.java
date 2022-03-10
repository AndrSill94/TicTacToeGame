public class Player1 extends Player{


    public Player1(String name, String select) {
        super(name, select);
    }

    public Player1(String name) {
        super(name);
    }

    @Override
    public String makeAmove() {
        return super.getPlayerSelect();
    }
}
