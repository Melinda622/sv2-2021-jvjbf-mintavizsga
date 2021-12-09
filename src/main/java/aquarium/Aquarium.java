package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> fishes=new ArrayList<>();

    public static final int CAPACITY=20;

    public void addFish(Fish fish){
        if(CAPACITY/(fishes.size()+1)<5){
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }else{
            fishes.add(fish);
        }
    }

    public void feed(){
        for (Fish f:fishes) {
            f.feed();
        }
    }

    public List<String> getStatus(){
        List<String> status=new ArrayList<>();
        for (Fish f:fishes) {
            status.add(f.getStatus());
        }
        return status;
    }

    public int getNumberOfFishWithMemoryLoss(){
        int count=0;
        for (Fish f:fishes) {
            if (f.hasMemoryLoss()){
                count++;
            }
        }return count;
    }

    public void removeFish(int maxWeight){
        List<Fish> overweightFish=new ArrayList<>();
        for (Fish f:fishes) {
            if(f.getWeight()>maxWeight){
                overweightFish.add(f);
            }
        }fishes.removeAll(overweightFish);
    }

    public boolean isThereFishWithGivenColor(String color){
        for (Fish f:fishes) {
            if (f.getColor().equalsIgnoreCase(color)) {
                return true;
            }
        }  return false;
    }

    public Fish getSmallestFish(){
        Fish smallestFish=fishes.get(0);
        for (Fish f:fishes) {
            if (f.getWeight() < smallestFish.getWeight()) {
                smallestFish=f;
            }
        } return smallestFish;
    }
}
