public class Player extends Human{
    private String take;
    public void take(String thing){
        if (take == null) {
            take = thing;
        } else {
            take = take + "," + thing;
        }
    };
    public Backpack backpack = new Backpack();
    public Player(String name) {
        super(name + " the Man");
    }
    class Backpack{
        public String toString(){
            if (take == null) {
                return "the backpack is empty";
            } else {
                return take + " in the backpack";
            }
        }

    }
}
