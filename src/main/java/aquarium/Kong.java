package aquarium;

public class Kong extends Fish{

    public Kong(String name, int weight, String colour) {
        super(name, weight, colour);
    }

    @Override
    public void feed() {
        setWeight(getWeight()+2);
    }
}
