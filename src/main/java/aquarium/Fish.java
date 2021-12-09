package aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean shortTermMemoryLoss;

    protected Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;

    }

    public String getStatus() {
        return name + ", " +
                "weight: " + weight +
                ", color: " + color + ", " + "short-term memory loss: " +
                shortTermMemoryLoss;
    }

    public abstract void feed();

    public void setShortTermMemoryLoss(boolean shortTermMemoryLoss) {
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean hasMemoryLoss() {
        return shortTermMemoryLoss;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
