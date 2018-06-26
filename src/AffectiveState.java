//By Jacob

public class AffectiveState {
    private static AffectiveState affectiveState;
    private int state;
    private double weight;

    private AffectiveState(int state,double weight) {
        this.state = state;
        this.weight = weight;
    }

    public static AffectiveState getInstance(){
        if(affectiveState == null){
            affectiveState = new AffectiveState(0,0);
        }
        return affectiveState;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int type) {
        this.state = type;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double value) {
        this.weight = value;
    }

    public String toString() {
        return "Type number: " + this.state + ", weight: " + this.weight;
    }

}
