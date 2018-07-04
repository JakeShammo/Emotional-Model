//By Jacob

public class Emotion{
    private double weight;
    private int type;
    private double decayRate;

    public Emotion(double weight, int type) {
        this.weight = weight;
        this.type = type;
    }

    public double getDecayRate() {
        return decayRate;
    }

    public void setDecayRate(double decayRate) {
        this.decayRate = decayRate;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double value) {
        this.weight = value;
    }

    public String toString() {
        return "Type number: " + this.type + ", weight: " + this.weight;
    }

    public double decay(){
        weight = weight - weight*decayRate;
        return weight;
    }
}
